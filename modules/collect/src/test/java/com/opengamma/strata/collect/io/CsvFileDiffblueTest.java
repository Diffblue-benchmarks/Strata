package com.opengamma.strata.collect.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.google.common.io.CharSource;
import com.opengamma.strata.collect.io.UnicodeBom.UnicodeBomCharSource;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.UncheckedIOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CsvFileDiffblueTest {
  /**
   * Test {@link CsvFile#of(List, List)} with {@code headers}, {@code rows}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()}.
   *   <li>Then return rows size is one.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(List, List)}
   */
  @Test
  @DisplayName(
      "Test of(List, List) with 'headers', 'rows'; given ArrayList(); then return rows size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(List, List)"})
  void testOfWithHeadersRows_givenArrayList_thenReturnRowsSizeIsOne() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();

    ArrayList<List<String>> rows = new ArrayList<>();
    rows.add(new ArrayList<>());

    // Act and Assert
    ImmutableList<CsvRow> rowsResult = CsvFile.of(headers, rows).rows();
    assertEquals(1, rowsResult.size());
    assertEquals(1, rowsResult.get(0).lineNumber());
  }

  /**
   * Test {@link CsvFile#of(List, List)} with {@code headers}, {@code rows}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()}.
   *   <li>Then return rows size is two.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(List, List)}
   */
  @Test
  @DisplayName(
      "Test of(List, List) with 'headers', 'rows'; given ArrayList(); then return rows size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(List, List)"})
  void testOfWithHeadersRows_givenArrayList_thenReturnRowsSizeIsTwo() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();

    ArrayList<List<String>> rows = new ArrayList<>();
    rows.add(new ArrayList<>());
    rows.add(new ArrayList<>());

    // Act and Assert
    ImmutableList<CsvRow> rowsResult = CsvFile.of(headers, rows).rows();
    assertEquals(2, rowsResult.size());
    CsvRow expectedGetResult = rowsResult.get(0);
    assertEquals(expectedGetResult, rowsResult.get(1));
  }

  /**
   * Test {@link CsvFile#of(List, List)} with {@code headers}, {@code rows}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(List, List)}
   */
  @Test
  @DisplayName(
      "Test of(List, List) with 'headers', 'rows'; given ArrayList(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(List, List)"})
  void testOfWithHeadersRows_givenArrayList_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    headers.add("headers");

    ArrayList<List<String>> rows = new ArrayList<>();
    rows.add(new ArrayList<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> CsvFile.of(headers, rows));
  }

  /**
   * Test {@link CsvFile#of(List, List)} with {@code headers}, {@code rows}.
   *
   * <ul>
   *   <li>Given empty string.
   *   <li>When {@link ArrayList#ArrayList()} add empty string.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(List, List)}
   */
  @Test
  @DisplayName(
      "Test of(List, List) with 'headers', 'rows'; given empty string; when ArrayList() add empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(List, List)"})
  void testOfWithHeadersRows_givenEmptyString_whenArrayListAddEmptyString() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    headers.add("");
    headers.add("foo");
    headers.add("rows");
    headers.add("headers");

    // Act
    CsvFile actualOfResult = CsvFile.of(headers, new ArrayList<>());

    // Assert
    assertTrue(actualOfResult.rows().isEmpty());
    assertEquals(headers, actualOfResult.headers());
  }

  /**
   * Test {@link CsvFile#of(List, List)} with {@code headers}, {@code rows}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code foo}.
   *   <li>Then return rows Empty.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(List, List)}
   */
  @Test
  @DisplayName(
      "Test of(List, List) with 'headers', 'rows'; given 'foo'; when ArrayList() add 'foo'; then return rows Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(List, List)"})
  void testOfWithHeadersRows_givenFoo_whenArrayListAddFoo_thenReturnRowsEmpty() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    headers.add("foo");
    headers.add("rows");
    headers.add("headers");

    // Act
    CsvFile actualOfResult = CsvFile.of(headers, new ArrayList<>());

    // Assert
    assertTrue(actualOfResult.rows().isEmpty());
    assertEquals(headers, actualOfResult.headers());
  }

  /**
   * Test {@link CsvFile#of(List, List)} with {@code headers}, {@code rows}.
   *
   * <ul>
   *   <li>Given {@code headers}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code headers}.
   *   <li>Then return rows Empty.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(List, List)}
   */
  @Test
  @DisplayName(
      "Test of(List, List) with 'headers', 'rows'; given 'headers'; when ArrayList() add 'headers'; then return rows Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(List, List)"})
  void testOfWithHeadersRows_givenHeaders_whenArrayListAddHeaders_thenReturnRowsEmpty() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    headers.add("headers");

    // Act
    CsvFile actualOfResult = CsvFile.of(headers, new ArrayList<>());

    // Assert
    assertTrue(actualOfResult.rows().isEmpty());
    assertEquals(headers, actualOfResult.headers());
  }

  /**
   * Test {@link CsvFile#of(List, List)} with {@code headers}, {@code rows}.
   *
   * <ul>
   *   <li>Given {@code rows}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code rows}.
   *   <li>Then return rows Empty.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(List, List)}
   */
  @Test
  @DisplayName(
      "Test of(List, List) with 'headers', 'rows'; given 'rows'; when ArrayList() add 'rows'; then return rows Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(List, List)"})
  void testOfWithHeadersRows_givenRows_whenArrayListAddRows_thenReturnRowsEmpty() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    headers.add("rows");
    headers.add("headers");

    // Act
    CsvFile actualOfResult = CsvFile.of(headers, new ArrayList<>());

    // Assert
    assertTrue(actualOfResult.rows().isEmpty());
    assertEquals(headers, actualOfResult.headers());
  }

  /**
   * Test {@link CsvFile#of(List, List)} with {@code headers}, {@code rows}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return rows is headers.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(List, List)}
   */
  @Test
  @DisplayName(
      "Test of(List, List) with 'headers', 'rows'; when ArrayList(); then return rows is headers")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(List, List)"})
  void testOfWithHeadersRows_whenArrayList_thenReturnRowsIsHeaders() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();

    // Act
    CsvFile actualOfResult = CsvFile.of(headers, new ArrayList<>());

    // Assert
    ImmutableList<String> headersResult = actualOfResult.headers();
    assertEquals(headers, headersResult);
    assertSame(headersResult, actualOfResult.rows());
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean)}
   */
  @Test
  @DisplayName("Test of(Reader, boolean) with 'reader', 'headerRow'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow() throws IOException {
    // Arrange
    CharArrayReader reader = new CharArrayReader(",\u0001,\u0001,\u0001,\u0001".toCharArray());

    // Act
    CsvFile actualOfResult = CsvFile.of(reader, false);

    // Assert
    assertFalse(reader.ready());
    ImmutableList<String> headersResult = actualOfResult.headers();
    assertTrue(headersResult.isEmpty());
    assertSame(headersResult, actualOfResult.rows());
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean, char)} with {@code reader}, {@code headerRow}, {@code
   * separator}.
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName("Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator() throws UnsupportedEncodingException {
    // Arrange, Act and Assert
    ImmutableList<CsvRow> rowsResult =
        CsvFile.of(
                new InputStreamReader(new ByteArrayInputStream(" XAXAXAX".getBytes("UTF-8"))),
                false,
                'A')
            .rows();
    assertEquals(1, rowsResult.size());
    ImmutableList<String> fieldsResult = rowsResult.get(0).fields();
    assertEquals(4, fieldsResult.size());
    assertEquals("X", fieldsResult.get(0));
    assertEquals("X", fieldsResult.get(2));
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean, char)} with {@code reader}, {@code headerRow}, {@code
   * separator}.
   *
   * <ul>
   *   <li>Then return headers Empty.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'; then return headers Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator_thenReturnHeadersEmpty() {
    // Arrange and Act
    CsvFile actualOfResult = CsvFile.of(new StringReader("#"), false, 'A');

    // Assert
    ImmutableList<String> headersResult = actualOfResult.headers();
    assertTrue(headersResult.isEmpty());
    assertSame(headersResult, actualOfResult.rows());
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean, char)} with {@code reader}, {@code headerRow}, {@code
   * separator}.
   *
   * <ul>
   *   <li>Then return headers size is one.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'; then return headers size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator_thenReturnHeadersSizeIsOne() {
    // Arrange and Act
    CsvFile actualOfResult = CsvFile.of(new StringReader("foo"), true, 'A');

    // Assert
    ImmutableList<String> headersResult = actualOfResult.headers();
    assertEquals(1, headersResult.size());
    assertEquals("foo", headersResult.get(0));
    assertTrue(actualOfResult.rows().isEmpty());
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean, char)} with {@code reader}, {@code headerRow}, {@code
   * separator}.
   *
   * <ul>
   *   <li>Then return rows first fields fifth is {@code =}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'; then return rows first fields fifth is '='")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator_thenReturnRowsFirstFieldsFifthIsEqualsSign()
      throws UnsupportedEncodingException {
    // Arrange, Act and Assert
    ImmutableList<CsvRow> rowsResult =
        CsvFile.of(
                new InputStreamReader(new ByteArrayInputStream("AXAXAXA=".getBytes("UTF-8"))),
                false,
                'A')
            .rows();
    assertEquals(1, rowsResult.size());
    ImmutableList<String> fieldsResult = rowsResult.get(0).fields();
    assertEquals(5, fieldsResult.size());
    assertEquals("", fieldsResult.get(0));
    assertEquals("=", fieldsResult.get(4));
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean, char)} with {@code reader}, {@code headerRow}, {@code
   * separator}.
   *
   * <ul>
   *   <li>Then return rows first fields fifth is {@code X}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'; then return rows first fields fifth is 'X'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator_thenReturnRowsFirstFieldsFifthIsX()
      throws UnsupportedEncodingException {
    // Arrange, Act and Assert
    ImmutableList<CsvRow> rowsResult =
        CsvFile.of(
                new InputStreamReader(new ByteArrayInputStream("AXAXAXAX".getBytes("UTF-8"))),
                false,
                'A')
            .rows();
    assertEquals(1, rowsResult.size());
    ImmutableList<String> fieldsResult = rowsResult.get(0).fields();
    assertEquals(5, fieldsResult.size());
    assertEquals("", fieldsResult.get(0));
    assertEquals("X", fieldsResult.get(4));
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean, char)} with {@code reader}, {@code headerRow}, {@code
   * separator}.
   *
   * <ul>
   *   <li>Then return rows first fields first is {@code AXAXAX}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'; then return rows first fields first is 'AXAXAX'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator_thenReturnRowsFirstFieldsFirstIsAxaxax()
      throws UnsupportedEncodingException {
    // Arrange
    InputStreamReader reader =
        new InputStreamReader(new ByteArrayInputStream("=\"AXAXAX".getBytes("UTF-8")));

    // Act
    CsvFile actualOfResult = CsvFile.of(reader, false, 'A');

    // Assert
    Stream<String> linesResult = new BufferedReader(reader).lines();
    assertEquals("", linesResult.collect(Collectors.joining("\n")));
    ImmutableList<CsvRow> rowsResult = actualOfResult.rows();
    assertEquals(1, rowsResult.size());
    ImmutableList<String> fieldsResult = rowsResult.get(0).fields();
    assertEquals(1, fieldsResult.size());
    assertEquals("AXAXAX", fieldsResult.get(0));
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean, char)} with {@code reader}, {@code headerRow}, {@code
   * separator}.
   *
   * <ul>
   *   <li>Then return rows first fields first is {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'; then return rows first fields first is 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator_thenReturnRowsFirstFieldsFirstIsFoo() {
    // Arrange, Act and Assert
    ImmutableList<CsvRow> rowsResult = CsvFile.of(new StringReader("foo"), false, 'A').rows();
    assertEquals(1, rowsResult.size());
    CsvRow getResult = rowsResult.get(0);
    ImmutableList<String> fieldsResult = getResult.fields();
    assertEquals(1, fieldsResult.size());
    assertEquals("foo", fieldsResult.get(0));
    assertEquals(1, getResult.lineNumber());
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean, char)} with {@code reader}, {@code headerRow}, {@code
   * separator}.
   *
   * <ul>
   *   <li>Then return rows first fields first is {@code =X}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'; then return rows first fields first is '=X'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator_thenReturnRowsFirstFieldsFirstIsX()
      throws UnsupportedEncodingException {
    // Arrange, Act and Assert
    ImmutableList<CsvRow> rowsResult =
        CsvFile.of(
                new InputStreamReader(new ByteArrayInputStream("=XAXAXAX".getBytes("UTF-8"))),
                false,
                'A')
            .rows();
    assertEquals(1, rowsResult.size());
    ImmutableList<String> fieldsResult = rowsResult.get(0).fields();
    assertEquals(4, fieldsResult.size());
    assertEquals("=X", fieldsResult.get(0));
    assertEquals("X", fieldsResult.get(2));
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean, char)} with {@code reader}, {@code headerRow}, {@code
   * separator}.
   *
   * <ul>
   *   <li>Then return rows first fields first is {@code "XAXAX}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'; then return rows first fields first is '\"XAXAX'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator_thenReturnRowsFirstFieldsFirstIsXaxax()
      throws UnsupportedEncodingException {
    // Arrange
    InputStreamReader reader =
        new InputStreamReader(new ByteArrayInputStream("\"\"\"XAXAX".getBytes("UTF-8")));

    // Act
    CsvFile actualOfResult = CsvFile.of(reader, false, 'A');

    // Assert
    Stream<String> linesResult = new BufferedReader(reader).lines();
    assertEquals("", linesResult.collect(Collectors.joining("\n")));
    ImmutableList<CsvRow> rowsResult = actualOfResult.rows();
    assertEquals(1, rowsResult.size());
    ImmutableList<String> fieldsResult = rowsResult.get(0).fields();
    assertEquals(1, fieldsResult.size());
    assertEquals("\"XAXAX", fieldsResult.get(0));
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean, char)} with {@code reader}, {@code headerRow}, {@code
   * separator}.
   *
   * <ul>
   *   <li>Then return rows first fields first is {@code XAXAXA}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'; then return rows first fields first is 'XAXAXA'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator_thenReturnRowsFirstFieldsFirstIsXaxaxa()
      throws UnsupportedEncodingException {
    // Arrange
    InputStreamReader reader =
        new InputStreamReader(new ByteArrayInputStream("\"XAXAXA\"".getBytes("UTF-8")));

    // Act
    CsvFile actualOfResult = CsvFile.of(reader, false, 'A');

    // Assert
    Stream<String> linesResult = new BufferedReader(reader).lines();
    assertEquals("", linesResult.collect(Collectors.joining("\n")));
    ImmutableList<CsvRow> rowsResult = actualOfResult.rows();
    assertEquals(1, rowsResult.size());
    ImmutableList<String> fieldsResult = rowsResult.get(0).fields();
    assertEquals(1, fieldsResult.size());
    assertEquals("XAXAXA", fieldsResult.get(0));
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean, char)} with {@code reader}, {@code headerRow}, {@code
   * separator}.
   *
   * <ul>
   *   <li>Then return rows first fields first is {@code XAXAXAX}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'; then return rows first fields first is 'XAXAXAX'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator_thenReturnRowsFirstFieldsFirstIsXaxaxax()
      throws UnsupportedEncodingException {
    // Arrange
    InputStreamReader reader =
        new InputStreamReader(new ByteArrayInputStream("\"XAXAXAX".getBytes("UTF-8")));

    // Act
    CsvFile actualOfResult = CsvFile.of(reader, false, 'A');

    // Assert
    Stream<String> linesResult = new BufferedReader(reader).lines();
    assertEquals("", linesResult.collect(Collectors.joining("\n")));
    ImmutableList<CsvRow> rowsResult = actualOfResult.rows();
    assertEquals(1, rowsResult.size());
    ImmutableList<String> fieldsResult = rowsResult.get(0).fields();
    assertEquals(1, fieldsResult.size());
    assertEquals("XAXAXAX", fieldsResult.get(0));
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean, char)} with {@code reader}, {@code headerRow}, {@code
   * separator}.
   *
   * <ul>
   *   <li>When {@link ByteArrayInputStream#ByteArrayInputStream(byte[])} with {@code ""AXAXAX}
   *       Bytes is {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'; when ByteArrayInputStream(byte[]) with '\"\"AXAXAX' Bytes is 'UTF-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator_whenByteArrayInputStreamWithAxaxaxBytesIsUtf8()
      throws UnsupportedEncodingException {
    // Arrange, Act and Assert
    ImmutableList<CsvRow> rowsResult =
        CsvFile.of(
                new InputStreamReader(new ByteArrayInputStream("\"\"AXAXAX".getBytes("UTF-8"))),
                false,
                'A')
            .rows();
    assertEquals(1, rowsResult.size());
    ImmutableList<String> fieldsResult = rowsResult.get(0).fields();
    assertEquals(4, fieldsResult.size());
    assertEquals("", fieldsResult.get(0));
    assertEquals("X", fieldsResult.get(2));
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean, char)} with {@code reader}, {@code headerRow}, {@code
   * separator}.
   *
   * <ul>
   *   <li>When {@code f}.
   *   <li>Then return headers size is two.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'; when 'f'; then return headers size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator_whenF_thenReturnHeadersSizeIsTwo() {
    // Arrange and Act
    CsvFile actualOfResult = CsvFile.of(new StringReader("foo"), true, 'f');

    // Assert
    ImmutableList<String> headersResult = actualOfResult.headers();
    assertEquals(2, headersResult.size());
    assertEquals("", headersResult.get(0));
    assertEquals("oo", headersResult.get(1));
    assertTrue(actualOfResult.rows().isEmpty());
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean, char)} with {@code reader}, {@code headerRow}, {@code
   * separator}.
   *
   * <ul>
   *   <li>When {@code ;}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName("Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'; when ';'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator_whenSemicolon() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> CsvFile.of(new StringReader(";"), true, ';'));
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean, char)} with {@code reader}, {@code headerRow}, {@code
   * separator}.
   *
   * <ul>
   *   <li>When {@link StringReader#StringReader(String)} with {@code #}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'; when StringReader(String) with '#'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator_whenStringReaderWithNumberSign() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> CsvFile.of(new StringReader("#"), true, 'A'));
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean, char)} with {@code reader}, {@code headerRow}, {@code
   * separator}.
   *
   * <ul>
   *   <li>When {@link StringReader#StringReader(String)} with {@code ;}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'; when StringReader(String) with ';'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator_whenStringReaderWithSemicolon() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> CsvFile.of(new StringReader(";"), true, 'A'));
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean, char)} with {@code reader}, {@code headerRow}, {@code
   * separator}.
   *
   * <ul>
   *   <li>When {@code X}.
   *   <li>Then return rows first fields first is {@code X}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'; when 'X'; then return rows first fields first is 'X'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator_whenX_thenReturnRowsFirstFieldsFirstIsX() {
    // Arrange
    ByteArrayInputStream byteArrayInputStream =
        new ByteArrayInputStream(new byte[] {1, 'X', 'A', 'X', 'A', 'X', 'A', 'X'});

    // Act and Assert
    ImmutableList<CsvRow> rowsResult =
        CsvFile.of(new InputStreamReader(byteArrayInputStream), false, 'A').rows();
    assertEquals(1, rowsResult.size());
    ImmutableList<String> fieldsResult = rowsResult.get(0).fields();
    assertEquals(4, fieldsResult.size());
    assertEquals("X", fieldsResult.get(0));
    assertEquals("X", fieldsResult.get(2));
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>Then return headers size is three.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; then return headers size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_thenReturnHeadersSizeIsThree() {
    // Arrange, Act and Assert
    ImmutableList<String> headersResult =
        CsvFile.of(new CharArrayReader(",A,A".toCharArray()), true).headers();
    assertEquals(3, headersResult.size());
    assertEquals("", headersResult.get(0));
    assertEquals("A", headersResult.get(1));
    assertEquals("A", headersResult.get(2));
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>Then return headers size is two.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; then return headers size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_thenReturnHeadersSizeIsTwo() {
    // Arrange and Act
    CsvFile actualOfResult = CsvFile.of(new CharArrayReader("=A,A".toCharArray()), true);

    // Assert
    ImmutableList<String> headersResult = actualOfResult.headers();
    assertEquals(2, headersResult.size());
    assertEquals("=A", headersResult.get(0));
    assertEquals("A", headersResult.get(1));
    assertTrue(actualOfResult.rows().isEmpty());
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>Then return rows first fields first is {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; then return rows first fields first is 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_thenReturnRowsFirstFieldsFirstIsA() {
    // Arrange, Act and Assert
    ImmutableList<CsvRow> rowsResult =
        CsvFile.of(new CharArrayReader(" A,A".toCharArray()), false).rows();
    assertEquals(1, rowsResult.size());
    ImmutableList<String> fieldsResult = rowsResult.get(0).fields();
    assertEquals(2, fieldsResult.size());
    assertEquals("A", fieldsResult.get(0));
    assertEquals("A", fieldsResult.get(1));
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>Then return rows first fields first is {@code =A}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; then return rows first fields first is '=A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_thenReturnRowsFirstFieldsFirstIsA2() {
    // Arrange, Act and Assert
    ImmutableList<CsvRow> rowsResult =
        CsvFile.of(new CharArrayReader("=A,A".toCharArray()), false).rows();
    assertEquals(1, rowsResult.size());
    ImmutableList<String> fieldsResult = rowsResult.get(0).fields();
    assertEquals(2, fieldsResult.size());
    assertEquals("=A", fieldsResult.get(0));
    assertEquals("A", fieldsResult.get(1));
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>Then return rows first fields first is {@code ,A}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; then return rows first fields first is ',A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_thenReturnRowsFirstFieldsFirstIsA3() {
    // Arrange, Act and Assert
    ImmutableList<CsvRow> rowsResult =
        CsvFile.of(new CharArrayReader("=\",A".toCharArray()), false).rows();
    assertEquals(1, rowsResult.size());
    CsvRow getResult = rowsResult.get(0);
    ImmutableList<String> fieldsResult = getResult.fields();
    assertEquals(1, fieldsResult.size());
    assertEquals(",A", fieldsResult.get(0));
    assertEquals(1, getResult.lineNumber());
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>Then return rows first fields first is {@code A,}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; then return rows first fields first is 'A,'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_thenReturnRowsFirstFieldsFirstIsA4() {
    // Arrange, Act and Assert
    ImmutableList<CsvRow> rowsResult =
        CsvFile.of(new CharArrayReader("\"A,\"".toCharArray()), false).rows();
    assertEquals(1, rowsResult.size());
    CsvRow getResult = rowsResult.get(0);
    ImmutableList<String> fieldsResult = getResult.fields();
    assertEquals(1, fieldsResult.size());
    assertEquals("A,", fieldsResult.get(0));
    assertEquals(1, getResult.lineNumber());
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>Then return rows first fields first is {@code "A}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; then return rows first fields first is '\"A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_thenReturnRowsFirstFieldsFirstIsA5() {
    // Arrange, Act and Assert
    ImmutableList<CsvRow> rowsResult =
        CsvFile.of(new CharArrayReader("\"\"\"A".toCharArray()), false).rows();
    assertEquals(1, rowsResult.size());
    CsvRow getResult = rowsResult.get(0);
    ImmutableList<String> fieldsResult = getResult.fields();
    assertEquals(1, fieldsResult.size());
    assertEquals("\"A", fieldsResult.get(0));
    assertEquals(1, getResult.lineNumber());
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>Then return rows first fields first is {@code A,A}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; then return rows first fields first is 'A,A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_thenReturnRowsFirstFieldsFirstIsAA() {
    // Arrange, Act and Assert
    ImmutableList<CsvRow> rowsResult =
        CsvFile.of(new CharArrayReader("\"A,A".toCharArray()), false).rows();
    assertEquals(1, rowsResult.size());
    CsvRow getResult = rowsResult.get(0);
    ImmutableList<String> fieldsResult = getResult.fields();
    assertEquals(1, fieldsResult.size());
    assertEquals("A,A", fieldsResult.get(0));
    assertEquals(1, getResult.lineNumber());
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>Then return rows first fields first is {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; then return rows first fields first is 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_thenReturnRowsFirstFieldsFirstIsFoo() {
    // Arrange, Act and Assert
    ImmutableList<CsvRow> rowsResult = CsvFile.of(new StringReader("foo"), false).rows();
    assertEquals(1, rowsResult.size());
    CsvRow getResult = rowsResult.get(0);
    ImmutableList<String> fieldsResult = getResult.fields();
    assertEquals(1, fieldsResult.size());
    assertEquals("foo", fieldsResult.get(0));
    assertEquals(1, getResult.lineNumber());
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>Then return rows first fields size is five.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; then return rows first fields size is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_thenReturnRowsFirstFieldsSizeIsFive()
      throws UnsupportedEncodingException {
    // Arrange
    InputStreamReader reader =
        new InputStreamReader(new ByteArrayInputStream("A,A,A,A,".getBytes("UTF-8")));

    // Act and Assert
    ImmutableList<CsvRow> rowsResult = CsvFile.of(reader, false).rows();
    assertEquals(1, rowsResult.size());
    ImmutableList<String> fieldsResult = rowsResult.get(0).fields();
    assertEquals(5, fieldsResult.size());
    assertEquals("", fieldsResult.get(4));
    Stream<String> linesResult = new BufferedReader(reader).lines();
    assertEquals("", linesResult.collect(Collectors.joining("\n")));
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>Then return rows first fields size is four.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; then return rows first fields size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_thenReturnRowsFirstFieldsSizeIsFour() {
    // Arrange, Act and Assert
    ImmutableList<CsvRow> rowsResult =
        CsvFile.of(new CharArrayReader(",,,A".toCharArray()), false).rows();
    assertEquals(1, rowsResult.size());
    ImmutableList<String> fieldsResult = rowsResult.get(0).fields();
    assertEquals(4, fieldsResult.size());
    assertEquals("", fieldsResult.get(1));
    assertEquals("", fieldsResult.get(2));
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>Then return rows first fields third is {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; then return rows first fields third is 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_thenReturnRowsFirstFieldsThirdIsA() {
    // Arrange, Act and Assert
    ImmutableList<CsvRow> rowsResult =
        CsvFile.of(new CharArrayReader(",A,A".toCharArray()), false).rows();
    assertEquals(1, rowsResult.size());
    ImmutableList<String> fieldsResult = rowsResult.get(0).fields();
    assertEquals(3, fieldsResult.size());
    assertEquals("", fieldsResult.get(0));
    assertEquals("A", fieldsResult.get(2));
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>Then return rows first fields third is {@code =}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; then return rows first fields third is '='")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_thenReturnRowsFirstFieldsThirdIsEqualsSign() {
    // Arrange, Act and Assert
    ImmutableList<CsvRow> rowsResult =
        CsvFile.of(new CharArrayReader(",A,=".toCharArray()), false).rows();
    assertEquals(1, rowsResult.size());
    ImmutableList<String> fieldsResult = rowsResult.get(0).fields();
    assertEquals(3, fieldsResult.size());
    assertEquals("", fieldsResult.get(0));
    assertEquals("=", fieldsResult.get(2));
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> CsvFile.of(new StringReader("#"), true));
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>When {@link CharArrayReader#CharArrayReader(char[])} with {@code "",A} toCharArray.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; when CharArrayReader(char[]) with '\"\",A' toCharArray")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_whenCharArrayReaderWithAToCharArray() {
    // Arrange, Act and Assert
    ImmutableList<CsvRow> rowsResult =
        CsvFile.of(new CharArrayReader("\"\",A".toCharArray()), false).rows();
    assertEquals(1, rowsResult.size());
    ImmutableList<String> fieldsResult = rowsResult.get(0).fields();
    assertEquals(2, fieldsResult.size());
    assertEquals("", fieldsResult.get(0));
    assertEquals("A", fieldsResult.get(1));
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>When {@link StringReader#StringReader(String)} with {@code foo}.
   *   <li>Then return headers size is one.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; when StringReader(String) with 'foo'; then return headers size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_whenStringReaderWithFoo_thenReturnHeadersSizeIsOne() {
    // Arrange and Act
    CsvFile actualOfResult = CsvFile.of(new StringReader("foo"), true);

    // Assert
    ImmutableList<String> headersResult = actualOfResult.headers();
    assertEquals(1, headersResult.size());
    assertEquals("foo", headersResult.get(0));
    assertTrue(actualOfResult.rows().isEmpty());
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>When {@link StringReader#StringReader(String)} with {@code #}.
   *   <li>Then return headers Empty.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; when StringReader(String) with '#'; then return headers Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_whenStringReaderWithNumberSign_thenReturnHeadersEmpty() {
    // Arrange and Act
    CsvFile actualOfResult = CsvFile.of(new StringReader("#"), false);

    // Assert
    ImmutableList<String> headersResult = actualOfResult.headers();
    assertTrue(headersResult.isEmpty());
    assertSame(headersResult, actualOfResult.rows());
  }

  /**
   * Test {@link CsvFile#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>When {@link StringReader#StringReader(String)} with {@code ;}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; when StringReader(String) with ';'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_whenStringReaderWithSemicolon() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> CsvFile.of(new StringReader(";"), true));
  }

  /**
   * Test {@link CsvFile#of(CharSource, boolean, char)} with {@code source}, {@code headerRow},
   * {@code separator}.
   *
   * <ul>
   *   <li>Then return headers size is four.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(CharSource, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean, char) with 'source', 'headerRow', 'separator'; then return headers size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(CharSource, boolean, char)"})
  void testOfWithSourceHeaderRowSeparator_thenReturnHeadersSizeIsFour() {
    // Arrange, Act and Assert
    ImmutableList<String> headersResult =
        CsvFile.of(StringCharSource.of("Resources.asByteSource("), true, 's').headers();
    assertEquals(4, headersResult.size());
    assertEquals(".a", headersResult.get(2));
    assertEquals("ByteSource(", headersResult.get(3));
    assertEquals("Re", headersResult.get(0));
  }

  /**
   * Test {@link CsvFile#of(CharSource, boolean, char)} with {@code source}, {@code headerRow},
   * {@code separator}.
   *
   * <ul>
   *   <li>Then return headers size is one.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(CharSource, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean, char) with 'source', 'headerRow', 'separator'; then return headers size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(CharSource, boolean, char)"})
  void testOfWithSourceHeaderRowSeparator_thenReturnHeadersSizeIsOne() {
    // Arrange and Act
    CsvFile actualOfResult = CsvFile.of(StringCharSource.of("source"), true, 'A');

    // Assert
    ImmutableList<String> headersResult = actualOfResult.headers();
    assertEquals(1, headersResult.size());
    assertEquals("source", headersResult.get(0));
    assertTrue(actualOfResult.rows().isEmpty());
  }

  /**
   * Test {@link CsvFile#of(CharSource, boolean, char)} with {@code source}, {@code headerRow},
   * {@code separator}.
   *
   * <ul>
   *   <li>Then return rows size is one.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(CharSource, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean, char) with 'source', 'headerRow', 'separator'; then return rows size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(CharSource, boolean, char)"})
  void testOfWithSourceHeaderRowSeparator_thenReturnRowsSizeIsOne() {
    // Arrange, Act and Assert
    ImmutableList<CsvRow> rowsResult = CsvFile.of(StringCharSource.of("source"), false, 'A').rows();
    assertEquals(1, rowsResult.size());
    CsvRow getResult = rowsResult.get(0);
    ImmutableList<String> fieldsResult = getResult.fields();
    assertEquals(1, fieldsResult.size());
    assertEquals("source", fieldsResult.get(0));
    assertEquals(1, getResult.lineNumber());
  }

  /**
   * Test {@link CsvFile#of(CharSource, boolean, char)} with {@code source}, {@code headerRow},
   * {@code separator}.
   *
   * <ul>
   *   <li>When {@code e}.
   *   <li>Then return headers size is five.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(CharSource, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean, char) with 'source', 'headerRow', 'separator'; when 'e'; then return headers size is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(CharSource, boolean, char)"})
  void testOfWithSourceHeaderRowSeparator_whenE_thenReturnHeadersSizeIsFive() {
    // Arrange, Act and Assert
    ImmutableList<String> headersResult =
        CsvFile.of(StringCharSource.of("Resources.asByteSource("), true, 'e').headers();
    assertEquals(5, headersResult.size());
    assertEquals("(", headersResult.get(4));
    assertEquals("R", headersResult.get(0));
    assertEquals("Sourc", headersResult.get(3));
    assertEquals("s.asByt", headersResult.get(2));
    assertEquals("sourc", headersResult.get(1));
  }

  /**
   * Test {@link CsvFile#of(CharSource, boolean, char)} with {@code source}, {@code headerRow},
   * {@code separator}.
   *
   * <ul>
   *   <li>When {@link StringCharSource#EMPTY}.
   *   <li>Then return headers Empty.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(CharSource, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean, char) with 'source', 'headerRow', 'separator'; when EMPTY; then return headers Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(CharSource, boolean, char)"})
  void testOfWithSourceHeaderRowSeparator_whenEmpty_thenReturnHeadersEmpty() {
    // Arrange and Act
    CsvFile actualOfResult = CsvFile.of(StringCharSource.EMPTY, false, 'A');

    // Assert
    ImmutableList<String> headersResult = actualOfResult.headers();
    assertTrue(headersResult.isEmpty());
    assertSame(headersResult, actualOfResult.rows());
  }

  /**
   * Test {@link CsvFile#of(CharSource, boolean, char)} with {@code source}, {@code headerRow},
   * {@code separator}.
   *
   * <ul>
   *   <li>When {@link StringCharSource#EMPTY}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(CharSource, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean, char) with 'source', 'headerRow', 'separator'; when EMPTY; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(CharSource, boolean, char)"})
  void testOfWithSourceHeaderRowSeparator_whenEmpty_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> CsvFile.of(StringCharSource.EMPTY, true, 'A'));
  }

  /**
   * Test {@link CsvFile#of(CharSource, boolean, char)} with {@code source}, {@code headerRow},
   * {@code separator}.
   *
   * <ul>
   *   <li>When {@code s}.
   *   <li>Then return headers size is two.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(CharSource, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean, char) with 'source', 'headerRow', 'separator'; when 's'; then return headers size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(CharSource, boolean, char)"})
  void testOfWithSourceHeaderRowSeparator_whenS_thenReturnHeadersSizeIsTwo() {
    // Arrange and Act
    CsvFile actualOfResult = CsvFile.of(StringCharSource.of("source"), true, 's');

    // Assert
    ImmutableList<String> headersResult = actualOfResult.headers();
    assertEquals(2, headersResult.size());
    assertEquals("", headersResult.get(0));
    assertEquals("ource", headersResult.get(1));
    assertTrue(actualOfResult.rows().isEmpty());
  }

  /**
   * Test {@link CsvFile#of(CharSource, boolean, char)} with {@code source}, {@code headerRow},
   * {@code separator}.
   *
   * <ul>
   *   <li>When {@code ;}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(CharSource, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean, char) with 'source', 'headerRow', 'separator'; when ';'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(CharSource, boolean, char)"})
  void testOfWithSourceHeaderRowSeparator_whenSemicolon() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> CsvFile.of(StringCharSource.of(";"), true, ';'));
  }

  /**
   * Test {@link CsvFile#of(CharSource, boolean, char)} with {@code source}, {@code headerRow},
   * {@code separator}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code #}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(CharSource, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean, char) with 'source', 'headerRow', 'separator'; when StringCharSource with str is '#'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(CharSource, boolean, char)"})
  void testOfWithSourceHeaderRowSeparator_whenStringCharSourceWithStrIsNumberSign() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> CsvFile.of(StringCharSource.of("#"), true, 'A'));
  }

  /**
   * Test {@link CsvFile#of(CharSource, boolean, char)} with {@code source}, {@code headerRow},
   * {@code separator}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code #}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(CharSource, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean, char) with 'source', 'headerRow', 'separator'; when StringCharSource with str is '#'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(CharSource, boolean, char)"})
  void testOfWithSourceHeaderRowSeparator_whenStringCharSourceWithStrIsNumberSign2() {
    // Arrange and Act
    CsvFile actualOfResult = CsvFile.of(StringCharSource.of("#"), false, 'A');

    // Assert
    ImmutableList<String> headersResult = actualOfResult.headers();
    assertTrue(headersResult.isEmpty());
    assertSame(headersResult, actualOfResult.rows());
  }

  /**
   * Test {@link CsvFile#of(CharSource, boolean, char)} with {@code source}, {@code headerRow},
   * {@code separator}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code ;}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(CharSource, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean, char) with 'source', 'headerRow', 'separator'; when StringCharSource with str is ';'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(CharSource, boolean, char)"})
  void testOfWithSourceHeaderRowSeparator_whenStringCharSourceWithStrIsSemicolon() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> CsvFile.of(StringCharSource.of(";"), true, 'A'));
  }

  /**
   * Test {@link CsvFile#of(CharSource, boolean, char)} with {@code source}, {@code headerRow},
   * {@code separator}.
   *
   * <ul>
   *   <li>When {@link UnicodeBomCharSource#UnicodeBomCharSource(BeanByteSource)} with underlying is
   *       {@link ArrayByteSource#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(CharSource, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean, char) with 'source', 'headerRow', 'separator'; when UnicodeBomCharSource(BeanByteSource) with underlying is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(CharSource, boolean, char)"})
  void testOfWithSourceHeaderRowSeparator_whenUnicodeBomCharSourceWithUnderlyingIsEmpty() {
    // Arrange and Act
    CsvFile actualOfResult =
        CsvFile.of(new UnicodeBomCharSource(ArrayByteSource.EMPTY), false, 'A');

    // Assert
    ImmutableList<String> headersResult = actualOfResult.headers();
    assertTrue(headersResult.isEmpty());
    assertSame(headersResult, actualOfResult.rows());
  }

  /**
   * Test {@link CsvFile#of(CharSource, boolean)} with {@code source}, {@code headerRow}.
   *
   * <ul>
   *   <li>Then return headers size is one.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(CharSource, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean) with 'source', 'headerRow'; then return headers size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(CharSource, boolean)"})
  void testOfWithSourceHeaderRow_thenReturnHeadersSizeIsOne() {
    // Arrange and Act
    CsvFile actualOfResult = CsvFile.of(StringCharSource.of("source"), true);

    // Assert
    ImmutableList<String> headersResult = actualOfResult.headers();
    assertEquals(1, headersResult.size());
    assertEquals("source", headersResult.get(0));
    assertTrue(actualOfResult.rows().isEmpty());
  }

  /**
   * Test {@link CsvFile#of(CharSource, boolean)} with {@code source}, {@code headerRow}.
   *
   * <ul>
   *   <li>Then return rows size is one.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(CharSource, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean) with 'source', 'headerRow'; then return rows size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(CharSource, boolean)"})
  void testOfWithSourceHeaderRow_thenReturnRowsSizeIsOne() {
    // Arrange, Act and Assert
    ImmutableList<CsvRow> rowsResult = CsvFile.of(StringCharSource.of("source"), false).rows();
    assertEquals(1, rowsResult.size());
    CsvRow getResult = rowsResult.get(0);
    ImmutableList<String> fieldsResult = getResult.fields();
    assertEquals(1, fieldsResult.size());
    assertEquals("source", fieldsResult.get(0));
    assertEquals(1, getResult.lineNumber());
  }

  /**
   * Test {@link CsvFile#of(CharSource, boolean)} with {@code source}, {@code headerRow}.
   *
   * <ul>
   *   <li>When {@link StringCharSource#EMPTY}.
   *   <li>Then return headers Empty.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(CharSource, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean) with 'source', 'headerRow'; when EMPTY; then return headers Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(CharSource, boolean)"})
  void testOfWithSourceHeaderRow_whenEmpty_thenReturnHeadersEmpty() {
    // Arrange and Act
    CsvFile actualOfResult = CsvFile.of(StringCharSource.EMPTY, false);

    // Assert
    ImmutableList<String> headersResult = actualOfResult.headers();
    assertTrue(headersResult.isEmpty());
    assertSame(headersResult, actualOfResult.rows());
  }

  /**
   * Test {@link CsvFile#of(CharSource, boolean)} with {@code source}, {@code headerRow}.
   *
   * <ul>
   *   <li>When {@link StringCharSource#EMPTY}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(CharSource, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean) with 'source', 'headerRow'; when EMPTY; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(CharSource, boolean)"})
  void testOfWithSourceHeaderRow_whenEmpty_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> CsvFile.of(StringCharSource.EMPTY, true));
  }

  /**
   * Test {@link CsvFile#of(CharSource, boolean)} with {@code source}, {@code headerRow}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code #}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(CharSource, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean) with 'source', 'headerRow'; when StringCharSource with str is '#'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(CharSource, boolean)"})
  void testOfWithSourceHeaderRow_whenStringCharSourceWithStrIsNumberSign() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> CsvFile.of(StringCharSource.of("#"), true));
  }

  /**
   * Test {@link CsvFile#of(CharSource, boolean)} with {@code source}, {@code headerRow}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code #}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(CharSource, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean) with 'source', 'headerRow'; when StringCharSource with str is '#'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(CharSource, boolean)"})
  void testOfWithSourceHeaderRow_whenStringCharSourceWithStrIsNumberSign2() {
    // Arrange and Act
    CsvFile actualOfResult = CsvFile.of(StringCharSource.of("#"), false);

    // Assert
    ImmutableList<String> headersResult = actualOfResult.headers();
    assertTrue(headersResult.isEmpty());
    assertSame(headersResult, actualOfResult.rows());
  }

  /**
   * Test {@link CsvFile#of(CharSource, boolean)} with {@code source}, {@code headerRow}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code ;}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(CharSource, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean) with 'source', 'headerRow'; when StringCharSource with str is ';'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(CharSource, boolean)"})
  void testOfWithSourceHeaderRow_whenStringCharSourceWithStrIsSemicolon() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> CsvFile.of(StringCharSource.of(";"), true));
  }

  /**
   * Test {@link CsvFile#of(CharSource, boolean)} with {@code source}, {@code headerRow}.
   *
   * <ul>
   *   <li>When {@link UnicodeBomCharSource#UnicodeBomCharSource(BeanByteSource)} with underlying is
   *       {@link ArrayByteSource#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#of(CharSource, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean) with 'source', 'headerRow'; when UnicodeBomCharSource(BeanByteSource) with underlying is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.of(CharSource, boolean)"})
  void testOfWithSourceHeaderRow_whenUnicodeBomCharSourceWithUnderlyingIsEmpty() {
    // Arrange and Act
    CsvFile actualOfResult = CsvFile.of(new UnicodeBomCharSource(ArrayByteSource.EMPTY), false);

    // Assert
    ImmutableList<String> headersResult = actualOfResult.headers();
    assertTrue(headersResult.isEmpty());
    assertSame(headersResult, actualOfResult.rows());
  }

  /**
   * Test {@link CsvFile#parseLine(String, char)}.
   *
   * <ul>
   *   <li>When {@code CsvFile}.
   *   <li>Then return size is five.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#parseLine(String, char)}
   */
  @Test
  @DisplayName(
      "Test parseLine(String, char); when 'com.opengamma.strata.collect.io.CsvFile'; then return size is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList CsvFile.parseLine(String, char)"})
  void testParseLine_whenComOpengammaStrataCollectIoCsvFile_thenReturnSizeIsFive() {
    // Arrange and Act
    ImmutableList<String> actualParseLineResult =
        CsvFile.parseLine("com.opengamma.strata.collect.io.CsvFile", 'a');

    // Assert
    assertEquals(5, actualParseLineResult.size());
    assertEquals(".collect.io.CsvFile", actualParseLineResult.get(4));
    assertEquals(".str", actualParseLineResult.get(2));
    assertEquals("com.openg", actualParseLineResult.get(0));
    assertEquals("mm", actualParseLineResult.get(1));
    assertEquals("t", actualParseLineResult.get(3));
  }

  /**
   * Test {@link CsvFile#parseLine(String, char)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#parseLine(String, char)}
   */
  @Test
  @DisplayName("Test parseLine(String, char); when empty string; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList CsvFile.parseLine(String, char)"})
  void testParseLine_whenEmptyString_thenReturnEmpty() {
    // Arrange and Act
    ImmutableList<String> actualParseLineResult = CsvFile.parseLine("", 'A');

    // Assert
    assertTrue(actualParseLineResult.isEmpty());
  }

  /**
   * Test {@link CsvFile#parseLine(String, char)}.
   *
   * <ul>
   *   <li>When {@code String}.
   *   <li>Then return size is four.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#parseLine(String, char)}
   */
  @Test
  @DisplayName("Test parseLine(String, char); when 'java.lang.String'; then return size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList CsvFile.parseLine(String, char)"})
  void testParseLine_whenJavaLangString_thenReturnSizeIsFour() {
    // Arrange and Act
    ImmutableList<String> actualParseLineResult = CsvFile.parseLine("java.lang.String", 'a');

    // Assert
    assertEquals(4, actualParseLineResult.size());
    assertEquals(".l", actualParseLineResult.get(2));
    assertEquals("j", actualParseLineResult.get(0));
    assertEquals("ng.String", actualParseLineResult.get(3));
    assertEquals("v", actualParseLineResult.get(1));
  }

  /**
   * Test {@link CsvFile#parseLine(String, char)}.
   *
   * <ul>
   *   <li>When {@code Line}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#parseLine(String, char)}
   */
  @Test
  @DisplayName("Test parseLine(String, char); when 'Line'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList CsvFile.parseLine(String, char)"})
  void testParseLine_whenLine_thenReturnSizeIsOne() {
    // Arrange and Act
    ImmutableList<String> actualParseLineResult = CsvFile.parseLine("Line", 'A');

    // Assert
    assertEquals(1, actualParseLineResult.size());
    assertEquals("Line", actualParseLineResult.get(0));
  }

  /**
   * Test {@link CsvFile#parseLine(String, char)}.
   *
   * <ul>
   *   <li>When {@code #}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#parseLine(String, char)}
   */
  @Test
  @DisplayName("Test parseLine(String, char); when '#'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList CsvFile.parseLine(String, char)"})
  void testParseLine_whenNumberSign_thenReturnEmpty() {
    // Arrange and Act
    ImmutableList<String> actualParseLineResult = CsvFile.parseLine("#", ';');

    // Assert
    assertTrue(actualParseLineResult.isEmpty());
  }

  /**
   * Test {@link CsvFile#parseLine(String, char)}.
   *
   * <ul>
   *   <li>When {@code ""}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#parseLine(String, char)}
   */
  @Test
  @DisplayName("Test parseLine(String, char); when '\"\"'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList CsvFile.parseLine(String, char)"})
  void testParseLine_whenQuotationMarkQuotationMark_thenReturnEmpty() {
    // Arrange and Act
    ImmutableList<String> actualParseLineResult = CsvFile.parseLine("\"\"", 'A');

    // Assert
    assertTrue(actualParseLineResult.isEmpty());
  }

  /**
   * Test {@link CsvFile#parseLine(String, char)}.
   *
   * <ul>
   *   <li>When {@code "}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#parseLine(String, char)}
   */
  @Test
  @DisplayName("Test parseLine(String, char); when '\"'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList CsvFile.parseLine(String, char)"})
  void testParseLine_whenQuotationMark_thenReturnEmpty() {
    // Arrange and Act
    ImmutableList<String> actualParseLineResult = CsvFile.parseLine("\"", 'A');

    // Assert
    assertTrue(actualParseLineResult.isEmpty());
  }

  /**
   * Test {@link CsvFile#parseLine(String, char)}.
   *
   * <ul>
   *   <li>When {@code ;}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#parseLine(String, char)}
   */
  @Test
  @DisplayName("Test parseLine(String, char); when ';'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList CsvFile.parseLine(String, char)"})
  void testParseLine_whenSemicolon_thenReturnEmpty() {
    // Arrange and Act
    ImmutableList<String> actualParseLineResult = CsvFile.parseLine(";", ';');

    // Assert
    assertTrue(actualParseLineResult.isEmpty());
  }

  /**
   * Test {@link CsvFile#parseLine(String, char)}.
   *
   * <ul>
   *   <li>When {@code ;}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#parseLine(String, char)}
   */
  @Test
  @DisplayName("Test parseLine(String, char); when ';'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList CsvFile.parseLine(String, char)"})
  void testParseLine_whenSemicolon_thenReturnEmpty2() {
    // Arrange and Act
    ImmutableList<String> actualParseLineResult = CsvFile.parseLine(";", 'A');

    // Assert
    assertTrue(actualParseLineResult.isEmpty());
  }

  /**
   * Test {@link CsvFile#findSeparator(CharSource)}.
   *
   * <p>Method under test: {@link CsvFile#findSeparator(CharSource)}
   */
  @Test
  @DisplayName("Test findSeparator(CharSource)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"char CsvFile.findSeparator(CharSource)"})
  void testFindSeparator() {
    // Arrange, Act and Assert
    assertEquals(',', CsvFile.findSeparator(StringCharSource.of(",;\t:|")));
  }

  /**
   * Test {@link CsvFile#findSeparator(CharSource)}.
   *
   * <p>Method under test: {@link CsvFile#findSeparator(CharSource)}
   */
  @Test
  @DisplayName("Test findSeparator(CharSource)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"char CsvFile.findSeparator(CharSource)"})
  void testFindSeparator2() {
    // Arrange, Act and Assert
    assertEquals(',', CsvFile.findSeparator(new StringCharSource("\"\"", "foo.txt")));
  }

  /**
   * Test {@link CsvFile#findSeparator(CharSource)}.
   *
   * <p>Method under test: {@link CsvFile#findSeparator(CharSource)}
   */
  @Test
  @DisplayName("Test findSeparator(CharSource)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"char CsvFile.findSeparator(CharSource)"})
  void testFindSeparator3() {
    // Arrange, Act and Assert
    assertEquals(',', CsvFile.findSeparator(StringCharSource.of(",;\t:|,,,,,")));
  }

  /**
   * Test {@link CsvFile#findSeparator(CharSource)}.
   *
   * <ul>
   *   <li>Then return {@code ;}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#findSeparator(CharSource)}
   */
  @Test
  @DisplayName("Test findSeparator(CharSource); then return ';'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"char CsvFile.findSeparator(CharSource)"})
  void testFindSeparator_thenReturnSemicolon() {
    // Arrange, Act and Assert
    assertEquals(';', CsvFile.findSeparator(new StringCharSource(";", "foo.txt")));
  }

  /**
   * Test {@link CsvFile#findSeparator(CharSource)}.
   *
   * <ul>
   *   <li>Then return {@code |}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#findSeparator(CharSource)}
   */
  @Test
  @DisplayName("Test findSeparator(CharSource); then return '|'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"char CsvFile.findSeparator(CharSource)"})
  void testFindSeparator_thenReturnVerticalLine() {
    // Arrange, Act and Assert
    assertEquals('|', CsvFile.findSeparator(StringCharSource.of(",;\t:|\"\"")));
  }

  /**
   * Test {@link CsvFile#findSeparator(CharSource)}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#findSeparator(CharSource)}
   */
  @Test
  @DisplayName("Test findSeparator(CharSource); then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"char CsvFile.findSeparator(CharSource)"})
  void testFindSeparator_thenThrowUncheckedIOException() {
    // Arrange
    FileByteSource underlying =
        FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());

    // Act and Assert
    assertThrows(
        UncheckedIOException.class,
        () -> CsvFile.findSeparator(new UnicodeBomCharSource(underlying)));
  }

  /**
   * Test {@link CsvFile#findSeparator(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource#EMPTY}.
   *   <li>Then return {@code ,}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#findSeparator(CharSource)}
   */
  @Test
  @DisplayName("Test findSeparator(CharSource); when EMPTY; then return ','")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"char CsvFile.findSeparator(CharSource)"})
  void testFindSeparator_whenEmpty_thenReturnComma() {
    // Arrange, Act and Assert
    assertEquals(',', CsvFile.findSeparator(StringCharSource.EMPTY));
  }

  /**
   * Test {@link CsvFile#findSeparator(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource#StringCharSource(String, String)} with value is {@code 42}
   *       and fileName is {@code foo.txt}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#findSeparator(CharSource)}
   */
  @Test
  @DisplayName(
      "Test findSeparator(CharSource); when StringCharSource(String, String) with value is '42' and fileName is 'foo.txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"char CsvFile.findSeparator(CharSource)"})
  void testFindSeparator_whenStringCharSourceWithValueIs42AndFileNameIsFooTxt() {
    // Arrange, Act and Assert
    assertEquals(',', CsvFile.findSeparator(new StringCharSource("42", "foo.txt")));
  }

  /**
   * Test {@link CsvFile#findSeparator(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource#StringCharSource(String, String)} with value is {@code ,,}
   *       and fileName is {@code foo.txt}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#findSeparator(CharSource)}
   */
  @Test
  @DisplayName(
      "Test findSeparator(CharSource); when StringCharSource(String, String) with value is ',,' and fileName is 'foo.txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"char CsvFile.findSeparator(CharSource)"})
  void testFindSeparator_whenStringCharSourceWithValueIsCommaCommaAndFileNameIsFooTxt() {
    // Arrange, Act and Assert
    assertEquals(',', CsvFile.findSeparator(new StringCharSource(",,", "foo.txt")));
  }

  /**
   * Test {@link CsvFile#findSeparator(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource#StringCharSource(String, String)} with value is {@code #}
   *       and fileName is {@code foo.txt}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#findSeparator(CharSource)}
   */
  @Test
  @DisplayName(
      "Test findSeparator(CharSource); when StringCharSource(String, String) with value is '#' and fileName is 'foo.txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"char CsvFile.findSeparator(CharSource)"})
  void testFindSeparator_whenStringCharSourceWithValueIsNumberSignAndFileNameIsFooTxt() {
    // Arrange, Act and Assert
    assertEquals(',', CsvFile.findSeparator(new StringCharSource("#", "foo.txt")));
  }

  /**
   * Test {@link CsvFile#findSeparator(CharSource)}.
   *
   * <ul>
   *   <li>When {@link UnicodeBomCharSource#UnicodeBomCharSource(BeanByteSource)} with underlying is
   *       {@link ArrayByteSource#EMPTY}.
   *   <li>Then return {@code ,}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#findSeparator(CharSource)}
   */
  @Test
  @DisplayName(
      "Test findSeparator(CharSource); when UnicodeBomCharSource(BeanByteSource) with underlying is EMPTY; then return ','")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"char CsvFile.findSeparator(CharSource)"})
  void testFindSeparator_whenUnicodeBomCharSourceWithUnderlyingIsEmpty_thenReturnComma() {
    // Arrange, Act and Assert
    assertEquals(',', CsvFile.findSeparator(new UnicodeBomCharSource(ArrayByteSource.EMPTY)));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CsvFile#toString()}
   *   <li>{@link CsvFile#headers()}
   *   <li>{@link CsvFile#rows()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableList CsvFile.headers()",
    "ImmutableList CsvFile.rows()",
    "String CsvFile.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    CsvFile ofResult = CsvFile.of(headers, new ArrayList<>());

    // Act
    String actualToStringResult = ofResult.toString();
    ImmutableList<String> actualHeadersResult = ofResult.headers();

    // Assert
    assertEquals("CsvFile[]", actualToStringResult);
    assertSame(actualHeadersResult, ofResult.rows());
  }

  /**
   * Test {@link CsvFile#rowCount()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@link ArrayList#ArrayList()}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#rowCount()}
   */
  @Test
  @DisplayName("Test rowCount(); given ArrayList() add ArrayList(); then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CsvFile.rowCount()"})
  void testRowCount_givenArrayListAddArrayList_thenReturnOne() {
    // Arrange
    ArrayList<List<String>> rows = new ArrayList<>();
    rows.add(new ArrayList<>());

    // Act and Assert
    assertEquals(1, CsvFile.of(new ArrayList<>(), rows).rowCount());
  }

  /**
   * Test {@link CsvFile#rowCount()}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#rowCount()}
   */
  @Test
  @DisplayName("Test rowCount(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CsvFile.rowCount()"})
  void testRowCount_thenReturnZero() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();

    // Act and Assert
    assertEquals(0, CsvFile.of(headers, new ArrayList<>()).rowCount());
  }

  /**
   * Test {@link CsvFile#row(int)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@link ArrayList#ArrayList()}.
   *   <li>When one.
   *   <li>Then return lineNumber is two.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#row(int)}
   */
  @Test
  @DisplayName(
      "Test row(int); given ArrayList() add ArrayList(); when one; then return lineNumber is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvRow CsvFile.row(int)"})
  void testRow_givenArrayListAddArrayList_whenOne_thenReturnLineNumberIsTwo() {
    // Arrange
    ArrayList<List<String>> rows = new ArrayList<>();
    rows.add(new ArrayList<>());
    rows.add(new ArrayList<>());

    // Act
    CsvRow actualRowResult = CsvFile.of(new ArrayList<>(), rows).row(1);

    // Assert
    assertEquals(2, actualRowResult.lineNumber());
    ImmutableList<String> fieldsResult = actualRowResult.fields();
    assertTrue(fieldsResult.isEmpty());
    assertSame(fieldsResult, actualRowResult.headers());
  }

  /**
   * Test {@link CsvFile#row(int)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@link ArrayList#ArrayList()}.
   *   <li>When zero.
   *   <li>Then return lineNumber is one.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#row(int)}
   */
  @Test
  @DisplayName(
      "Test row(int); given ArrayList() add ArrayList(); when zero; then return lineNumber is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvRow CsvFile.row(int)"})
  void testRow_givenArrayListAddArrayList_whenZero_thenReturnLineNumberIsOne() {
    // Arrange
    ArrayList<List<String>> rows = new ArrayList<>();
    rows.add(new ArrayList<>());

    // Act
    CsvRow actualRowResult = CsvFile.of(new ArrayList<>(), rows).row(0);

    // Assert
    assertEquals(1, actualRowResult.lineNumber());
    ImmutableList<String> fieldsResult = actualRowResult.fields();
    assertTrue(fieldsResult.isEmpty());
    assertSame(fieldsResult, actualRowResult.headers());
  }

  /**
   * Test {@link CsvFile#containsHeader(Pattern)} with {@code headerPattern}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code foo}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#containsHeader(Pattern)}
   */
  @Test
  @DisplayName(
      "Test containsHeader(Pattern) with 'headerPattern'; given ArrayList() add 'foo'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CsvFile.containsHeader(Pattern)"})
  void testContainsHeaderWithHeaderPattern_givenArrayListAddFoo_thenReturnFalse() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    headers.add("foo");
    CsvFile ofResult = CsvFile.of(headers, new ArrayList<>());

    // Act and Assert
    assertFalse(ofResult.containsHeader(Pattern.compile(".*\\.txt")));
  }

  /**
   * Test {@link CsvFile#containsHeader(Pattern)} with {@code headerPattern}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code foo}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#containsHeader(Pattern)}
   */
  @Test
  @DisplayName(
      "Test containsHeader(Pattern) with 'headerPattern'; given ArrayList() add 'foo'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CsvFile.containsHeader(Pattern)"})
  void testContainsHeaderWithHeaderPattern_givenArrayListAddFoo_thenReturnFalse2() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    headers.add("foo");
    headers.add("foo");
    CsvFile ofResult = CsvFile.of(headers, new ArrayList<>());

    // Act and Assert
    assertFalse(ofResult.containsHeader(Pattern.compile(".*\\.txt")));
  }

  /**
   * Test {@link CsvFile#containsHeader(Pattern)} with {@code headerPattern}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code U.txt}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#containsHeader(Pattern)}
   */
  @Test
  @DisplayName(
      "Test containsHeader(Pattern) with 'headerPattern'; given ArrayList() add 'U.txt'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CsvFile.containsHeader(Pattern)"})
  void testContainsHeaderWithHeaderPattern_givenArrayListAddUTxt_thenReturnTrue() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    headers.add("U.txt");
    CsvFile ofResult = CsvFile.of(headers, new ArrayList<>());

    // Act and Assert
    assertTrue(ofResult.containsHeader(Pattern.compile(".*\\.txt")));
  }

  /**
   * Test {@link CsvFile#containsHeader(Pattern)} with {@code headerPattern}.
   *
   * <ul>
   *   <li>When compile {@code .*\.txt}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#containsHeader(Pattern)}
   */
  @Test
  @DisplayName(
      "Test containsHeader(Pattern) with 'headerPattern'; when compile '.*\\.txt'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CsvFile.containsHeader(Pattern)"})
  void testContainsHeaderWithHeaderPattern_whenCompileTxt_thenReturnFalse() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    CsvFile ofResult = CsvFile.of(headers, new ArrayList<>());

    // Act and Assert
    assertFalse(ofResult.containsHeader(Pattern.compile(".*\\.txt")));
  }

  /**
   * Test {@link CsvFile#containsHeader(String)} with {@code header}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>When {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#containsHeader(String)}
   */
  @Test
  @DisplayName(
      "Test containsHeader(String) with 'header'; given ArrayList() add '42'; when '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CsvFile.containsHeader(String)"})
  void testContainsHeaderWithHeader_givenArrayListAdd42_when42_thenReturnTrue() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    headers.add("42");
    headers.add("foo");

    // Act and Assert
    assertTrue(CsvFile.of(headers, new ArrayList<>()).containsHeader("42"));
  }

  /**
   * Test {@link CsvFile#containsHeader(String)} with {@code header}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>When {@code Header}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#containsHeader(String)}
   */
  @Test
  @DisplayName(
      "Test containsHeader(String) with 'header'; given ArrayList() add '42'; when 'Header'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CsvFile.containsHeader(String)"})
  void testContainsHeaderWithHeader_givenArrayListAdd42_whenHeader_thenReturnFalse() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    headers.add("42");
    headers.add("foo");

    // Act and Assert
    assertFalse(CsvFile.of(headers, new ArrayList<>()).containsHeader("Header"));
  }

  /**
   * Test {@link CsvFile#containsHeader(String)} with {@code header}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add empty string.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#containsHeader(String)}
   */
  @Test
  @DisplayName(
      "Test containsHeader(String) with 'header'; given ArrayList() add empty string; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CsvFile.containsHeader(String)"})
  void testContainsHeaderWithHeader_givenArrayListAddEmptyString_thenReturnFalse() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    headers.add("");
    headers.add("foo");

    // Act and Assert
    assertFalse(CsvFile.of(headers, new ArrayList<>()).containsHeader("Header"));
  }

  /**
   * Test {@link CsvFile#containsHeader(String)} with {@code header}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code foo}.
   *   <li>When {@code Header}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#containsHeader(String)}
   */
  @Test
  @DisplayName(
      "Test containsHeader(String) with 'header'; given ArrayList() add 'foo'; when 'Header'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CsvFile.containsHeader(String)"})
  void testContainsHeaderWithHeader_givenArrayListAddFoo_whenHeader_thenReturnFalse() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    headers.add("foo");

    // Act and Assert
    assertFalse(CsvFile.of(headers, new ArrayList<>()).containsHeader("Header"));
  }

  /**
   * Test {@link CsvFile#containsHeader(String)} with {@code header}.
   *
   * <ul>
   *   <li>When {@code Header}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#containsHeader(String)}
   */
  @Test
  @DisplayName("Test containsHeader(String) with 'header'; when 'Header'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CsvFile.containsHeader(String)"})
  void testContainsHeaderWithHeader_whenHeader_thenReturnFalse() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();

    // Act and Assert
    assertFalse(CsvFile.of(headers, new ArrayList<>()).containsHeader("Header"));
  }

  /**
   * Test {@link CsvFile#withHeaders(List)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@link ArrayList#ArrayList()}.
   *   <li>Then return rows first lineNumber is one.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#withHeaders(List)}
   */
  @Test
  @DisplayName(
      "Test withHeaders(List); given ArrayList() add ArrayList(); then return rows first lineNumber is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.withHeaders(List)"})
  void testWithHeaders_givenArrayListAddArrayList_thenReturnRowsFirstLineNumberIsOne() {
    // Arrange
    ArrayList<List<String>> rows = new ArrayList<>();
    rows.add(new ArrayList<>());
    CsvFile ofResult = CsvFile.of(new ArrayList<>(), rows);

    // Act and Assert
    ImmutableList<CsvRow> rowsResult = ofResult.withHeaders(new ArrayList<>()).rows();
    assertEquals(1, rowsResult.size());
    assertEquals(1, rowsResult.get(0).lineNumber());
  }

  /**
   * Test {@link CsvFile#withHeaders(List)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@link ArrayList#ArrayList()}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return rows size is two.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#withHeaders(List)}
   */
  @Test
  @DisplayName(
      "Test withHeaders(List); given ArrayList() add ArrayList(); when ArrayList(); then return rows size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.withHeaders(List)"})
  void testWithHeaders_givenArrayListAddArrayList_whenArrayList_thenReturnRowsSizeIsTwo() {
    // Arrange
    ArrayList<List<String>> rows = new ArrayList<>();
    rows.add(new ArrayList<>());
    rows.add(new ArrayList<>());
    CsvFile ofResult = CsvFile.of(new ArrayList<>(), rows);

    // Act and Assert
    ImmutableList<CsvRow> rowsResult = ofResult.withHeaders(new ArrayList<>()).rows();
    assertEquals(2, rowsResult.size());
    CsvRow expectedGetResult = rowsResult.get(0);
    assertEquals(expectedGetResult, rowsResult.get(1));
  }

  /**
   * Test {@link CsvFile#withHeaders(List)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code headers}.
   *   <li>Then return rows first fields size is one.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#withHeaders(List)}
   */
  @Test
  @DisplayName(
      "Test withHeaders(List); given ArrayList() add 'headers'; then return rows first fields size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.withHeaders(List)"})
  void testWithHeaders_givenArrayListAddHeaders_thenReturnRowsFirstFieldsSizeIsOne() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<>();
    stringList.add("headers");

    ArrayList<List<String>> rows = new ArrayList<>();
    rows.add(stringList);
    CsvFile ofResult = CsvFile.of(new ArrayList<>(), rows);

    // Act and Assert
    ImmutableList<CsvRow> rowsResult = ofResult.withHeaders(new ArrayList<>()).rows();
    assertEquals(1, rowsResult.size());
    ImmutableList<String> fieldsResult = rowsResult.get(0).fields();
    assertEquals(1, fieldsResult.size());
    assertEquals("headers", fieldsResult.get(0));
  }

  /**
   * Test {@link CsvFile#withHeaders(List)}.
   *
   * <ul>
   *   <li>Given empty string.
   *   <li>When {@link ArrayList#ArrayList()} add empty string.
   *   <li>Then return rows Empty.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#withHeaders(List)}
   */
  @Test
  @DisplayName(
      "Test withHeaders(List); given empty string; when ArrayList() add empty string; then return rows Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.withHeaders(List)"})
  void testWithHeaders_givenEmptyString_whenArrayListAddEmptyString_thenReturnRowsEmpty() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    CsvFile ofResult = CsvFile.of(headers, new ArrayList<>());

    ArrayList<String> headers2 = new ArrayList<>();
    headers2.add("");
    headers2.add("foo");
    headers2.add("rows");
    headers2.add("headers");

    // Act
    CsvFile actualWithHeadersResult = ofResult.withHeaders(headers2);

    // Assert
    assertTrue(actualWithHeadersResult.rows().isEmpty());
    assertEquals(headers2, actualWithHeadersResult.headers());
  }

  /**
   * Test {@link CsvFile#withHeaders(List)}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code foo}.
   *   <li>Then return rows Empty.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#withHeaders(List)}
   */
  @Test
  @DisplayName(
      "Test withHeaders(List); given 'foo'; when ArrayList() add 'foo'; then return rows Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.withHeaders(List)"})
  void testWithHeaders_givenFoo_whenArrayListAddFoo_thenReturnRowsEmpty() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    CsvFile ofResult = CsvFile.of(headers, new ArrayList<>());

    ArrayList<String> headers2 = new ArrayList<>();
    headers2.add("foo");
    headers2.add("rows");
    headers2.add("headers");

    // Act
    CsvFile actualWithHeadersResult = ofResult.withHeaders(headers2);

    // Assert
    assertTrue(actualWithHeadersResult.rows().isEmpty());
    assertEquals(headers2, actualWithHeadersResult.headers());
  }

  /**
   * Test {@link CsvFile#withHeaders(List)}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code foo}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#withHeaders(List)}
   */
  @Test
  @DisplayName(
      "Test withHeaders(List); given 'foo'; when ArrayList() add 'foo'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.withHeaders(List)"})
  void testWithHeaders_givenFoo_whenArrayListAddFoo_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<List<String>> rows = new ArrayList<>();
    rows.add(new ArrayList<>());
    CsvFile ofResult = CsvFile.of(new ArrayList<>(), rows);

    ArrayList<String> headers = new ArrayList<>();
    headers.add("foo");

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.withHeaders(headers));
  }

  /**
   * Test {@link CsvFile#withHeaders(List)}.
   *
   * <ul>
   *   <li>Given {@code headers}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code headers}.
   *   <li>Then return rows Empty.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#withHeaders(List)}
   */
  @Test
  @DisplayName(
      "Test withHeaders(List); given 'headers'; when ArrayList() add 'headers'; then return rows Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.withHeaders(List)"})
  void testWithHeaders_givenHeaders_whenArrayListAddHeaders_thenReturnRowsEmpty() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    CsvFile ofResult = CsvFile.of(headers, new ArrayList<>());

    ArrayList<String> headers2 = new ArrayList<>();
    headers2.add("headers");

    // Act
    CsvFile actualWithHeadersResult = ofResult.withHeaders(headers2);

    // Assert
    assertTrue(actualWithHeadersResult.rows().isEmpty());
    assertEquals(headers2, actualWithHeadersResult.headers());
  }

  /**
   * Test {@link CsvFile#withHeaders(List)}.
   *
   * <ul>
   *   <li>Given {@code rows}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code rows}.
   *   <li>Then return rows Empty.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#withHeaders(List)}
   */
  @Test
  @DisplayName(
      "Test withHeaders(List); given 'rows'; when ArrayList() add 'rows'; then return rows Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.withHeaders(List)"})
  void testWithHeaders_givenRows_whenArrayListAddRows_thenReturnRowsEmpty() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    CsvFile ofResult = CsvFile.of(headers, new ArrayList<>());

    ArrayList<String> headers2 = new ArrayList<>();
    headers2.add("rows");
    headers2.add("headers");

    // Act
    CsvFile actualWithHeadersResult = ofResult.withHeaders(headers2);

    // Assert
    assertTrue(actualWithHeadersResult.rows().isEmpty());
    assertEquals(headers2, actualWithHeadersResult.headers());
  }

  /**
   * Test {@link CsvFile#withHeaders(List)}.
   *
   * <ul>
   *   <li>Then return {@link CsvFile} with headers is {@link ArrayList#ArrayList()} and rows is
   *       {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#withHeaders(List)}
   */
  @Test
  @DisplayName(
      "Test withHeaders(List); then return CsvFile with headers is ArrayList() and rows is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvFile CsvFile.withHeaders(List)"})
  void testWithHeaders_thenReturnCsvFileWithHeadersIsArrayListAndRowsIsArrayList() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    CsvFile ofResult = CsvFile.of(headers, new ArrayList<>());

    // Act
    CsvFile actualWithHeadersResult = ofResult.withHeaders(new ArrayList<>());

    // Assert
    assertEquals(ofResult, actualWithHeadersResult);
  }

  /**
   * Test {@link CsvFile#containsHeaders(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#containsHeaders(Collection)}
   */
  @Test
  @DisplayName(
      "Test containsHeaders(Collection); given '42'; when ArrayList() add '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CsvFile.containsHeaders(Collection)"})
  void testContainsHeaders_given42_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    CsvFile ofResult = CsvFile.of(headers, new ArrayList<>());

    ArrayList<String> headers2 = new ArrayList<>();
    headers2.add("42");
    headers2.add("foo");

    // Act and Assert
    assertFalse(ofResult.containsHeaders(headers2));
  }

  /**
   * Test {@link CsvFile#containsHeaders(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#containsHeaders(Collection)}
   */
  @Test
  @DisplayName(
      "Test containsHeaders(Collection); given '42'; when ArrayList() add '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CsvFile.containsHeaders(Collection)"})
  void testContainsHeaders_given42_whenArrayListAdd42_thenReturnFalse2() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    headers.add("");
    headers.add("42");
    CsvFile ofResult = CsvFile.of(headers, new ArrayList<>());

    ArrayList<String> headers2 = new ArrayList<>();
    headers2.add("42");
    headers2.add("foo");

    // Act and Assert
    assertFalse(ofResult.containsHeaders(headers2));
  }

  /**
   * Test {@link CsvFile#containsHeaders(Collection)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code foo}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#containsHeaders(Collection)}
   */
  @Test
  @DisplayName(
      "Test containsHeaders(Collection); given ArrayList() add '42'; when ArrayList() add 'foo'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CsvFile.containsHeaders(Collection)"})
  void testContainsHeaders_givenArrayListAdd42_whenArrayListAddFoo_thenReturnFalse() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    headers.add("42");
    CsvFile ofResult = CsvFile.of(headers, new ArrayList<>());

    ArrayList<String> headers2 = new ArrayList<>();
    headers2.add("foo");

    // Act and Assert
    assertFalse(ofResult.containsHeaders(headers2));
  }

  /**
   * Test {@link CsvFile#containsHeaders(Collection)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add empty string.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#containsHeaders(Collection)}
   */
  @Test
  @DisplayName(
      "Test containsHeaders(Collection); given ArrayList() add empty string; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CsvFile.containsHeaders(Collection)"})
  void testContainsHeaders_givenArrayListAddEmptyString_thenReturnFalse() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    headers.add("");
    headers.add("42");
    CsvFile ofResult = CsvFile.of(headers, new ArrayList<>());

    ArrayList<String> headers2 = new ArrayList<>();
    headers2.add("foo");

    // Act and Assert
    assertFalse(ofResult.containsHeaders(headers2));
  }

  /**
   * Test {@link CsvFile#containsHeaders(Collection)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code foo}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code foo}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#containsHeaders(Collection)}
   */
  @Test
  @DisplayName(
      "Test containsHeaders(Collection); given ArrayList() add 'foo'; when ArrayList() add 'foo'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CsvFile.containsHeaders(Collection)"})
  void testContainsHeaders_givenArrayListAddFoo_whenArrayListAddFoo_thenReturnTrue() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    headers.add("foo");
    headers.add("");
    headers.add("42");
    CsvFile ofResult = CsvFile.of(headers, new ArrayList<>());

    ArrayList<String> headers2 = new ArrayList<>();
    headers2.add("foo");

    // Act and Assert
    assertTrue(ofResult.containsHeaders(headers2));
  }

  /**
   * Test {@link CsvFile#containsHeaders(Collection)}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code foo}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#containsHeaders(Collection)}
   */
  @Test
  @DisplayName(
      "Test containsHeaders(Collection); given 'foo'; when ArrayList() add 'foo'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CsvFile.containsHeaders(Collection)"})
  void testContainsHeaders_givenFoo_whenArrayListAddFoo_thenReturnFalse() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    CsvFile ofResult = CsvFile.of(headers, new ArrayList<>());

    ArrayList<String> headers2 = new ArrayList<>();
    headers2.add("foo");

    // Act and Assert
    assertFalse(ofResult.containsHeaders(headers2));
  }

  /**
   * Test {@link CsvFile#containsHeaders(Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#containsHeaders(Collection)}
   */
  @Test
  @DisplayName("Test containsHeaders(Collection); when ArrayList(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CsvFile.containsHeaders(Collection)"})
  void testContainsHeaders_whenArrayList_thenReturnTrue() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    CsvFile ofResult = CsvFile.of(headers, new ArrayList<>());

    // Act and Assert
    assertTrue(ofResult.containsHeaders(new ArrayList<>()));
  }

  /**
   * Test {@link CsvFile#equals(Object)}, and {@link CsvFile#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CsvFile#equals(Object)}
   *   <li>{@link CsvFile#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CsvFile.equals(Object)", "int CsvFile.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    CsvFile ofResult = CsvFile.of(headers, new ArrayList<>());
    ArrayList<String> headers2 = new ArrayList<>();
    CsvFile ofResult2 = CsvFile.of(headers2, new ArrayList<>());

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link CsvFile#equals(Object)}, and {@link CsvFile#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CsvFile#equals(Object)}
   *   <li>{@link CsvFile#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CsvFile.equals(Object)", "int CsvFile.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    CsvFile ofResult = CsvFile.of(headers, new ArrayList<>());

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link CsvFile#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CsvFile.equals(Object)", "int CsvFile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();

    // Act and Assert
    assertNotEquals(CsvFile.of(headers, new ArrayList<>()), 1);
  }

  /**
   * Test {@link CsvFile#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CsvFile.equals(Object)", "int CsvFile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    headers.add("foo");
    CsvFile ofResult = CsvFile.of(headers, new ArrayList<>());
    ArrayList<String> headers2 = new ArrayList<>();
    CsvFile ofResult2 = CsvFile.of(headers2, new ArrayList<>());

    // Act and Assert
    assertNotEquals(ofResult, ofResult2);
  }

  /**
   * Test {@link CsvFile#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CsvFile.equals(Object)", "int CsvFile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ArrayList<List<String>> rows = new ArrayList<>();
    rows.add(new ArrayList<>());
    CsvFile ofResult = CsvFile.of(new ArrayList<>(), rows);
    ArrayList<String> headers = new ArrayList<>();
    CsvFile ofResult2 = CsvFile.of(headers, new ArrayList<>());

    // Act and Assert
    assertNotEquals(ofResult, ofResult2);
  }

  /**
   * Test {@link CsvFile#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CsvFile.equals(Object)", "int CsvFile.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();

    // Act and Assert
    assertNotEquals(CsvFile.of(headers, new ArrayList<>()), null);
  }

  /**
   * Test {@link CsvFile#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CsvFile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CsvFile.equals(Object)", "int CsvFile.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();

    // Act and Assert
    assertNotEquals(CsvFile.of(headers, new ArrayList<>()), "Different type to CsvFile");
  }
}
