package com.opengamma.strata.collect.io;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.CharArrayWriter;
import java.io.PipedWriter;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CsvOutputDiffblueTest {
  /**
   * Test {@link CsvOutput#withHeaders(List, boolean)}.
   *
   * <ul>
   *   <li>Given empty string.
   *   <li>When {@link ArrayList#ArrayList()} add empty string.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#withHeaders(List, boolean)}
   */
  @Test
  @DisplayName(
      "Test withHeaders(List, boolean); given empty string; when ArrayList() add empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvOutput.CsvRowOutputWithHeaders CsvOutput.withHeaders(List, boolean)"})
  void testWithHeaders_givenEmptyString_whenArrayListAddEmptyString() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new CharArrayWriter());

    ArrayList<String> headers = new ArrayList<>();
    headers.add("");

    // Act and Assert
    assertEquals(headers, safeResult.withHeaders(headers, false).headers());
  }

  /**
   * Test {@link CsvOutput#withHeaders(List, boolean)}.
   *
   * <ul>
   *   <li>Given {@code first}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code first}.
   *   <li>Then return headers is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#withHeaders(List, boolean)}
   */
  @Test
  @DisplayName(
      "Test withHeaders(List, boolean); given 'first'; when ArrayList() add 'first'; then return headers is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvOutput.CsvRowOutputWithHeaders CsvOutput.withHeaders(List, boolean)"})
  void testWithHeaders_givenFirst_whenArrayListAddFirst_thenReturnHeadersIsArrayList() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new CharArrayWriter());

    ArrayList<String> headers = new ArrayList<>();
    headers.add("first");
    headers.add("line");

    // Act and Assert
    assertEquals(headers, safeResult.withHeaders(headers, true).headers());
  }

  /**
   * Test {@link CsvOutput#withHeaders(List, boolean)}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code foo}.
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#withHeaders(List, boolean)}
   */
  @Test
  @DisplayName(
      "Test withHeaders(List, boolean); given 'foo'; when ArrayList() add 'foo'; then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvOutput.CsvRowOutputWithHeaders CsvOutput.withHeaders(List, boolean)"})
  void testWithHeaders_givenFoo_whenArrayListAddFoo_thenThrowUncheckedIOException() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new PipedWriter());

    ArrayList<String> headers = new ArrayList<>();
    headers.add("foo");

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> safeResult.withHeaders(headers, true));
  }

  /**
   * Test {@link CsvOutput#withHeaders(List, boolean)}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code foo}.
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#withHeaders(List, boolean)}
   */
  @Test
  @DisplayName(
      "Test withHeaders(List, boolean); given 'foo'; when ArrayList() add 'foo'; then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvOutput.CsvRowOutputWithHeaders CsvOutput.withHeaders(List, boolean)"})
  void testWithHeaders_givenFoo_whenArrayListAddFoo_thenThrowUncheckedIOException2() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new PipedWriter());

    ArrayList<String> headers = new ArrayList<>();
    headers.add("foo");

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> safeResult.withHeaders(headers, false));
  }

  /**
   * Test {@link CsvOutput#withHeaders(List, boolean)}.
   *
   * <ul>
   *   <li>Given {@code line}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code line}.
   *   <li>Then return headers is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#withHeaders(List, boolean)}
   */
  @Test
  @DisplayName(
      "Test withHeaders(List, boolean); given 'line'; when ArrayList() add 'line'; then return headers is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvOutput.CsvRowOutputWithHeaders CsvOutput.withHeaders(List, boolean)"})
  void testWithHeaders_givenLine_whenArrayListAddLine_thenReturnHeadersIsArrayList() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new CharArrayWriter());

    ArrayList<String> headers = new ArrayList<>();
    headers.add("line");

    // Act and Assert
    assertEquals(headers, safeResult.withHeaders(headers, true).headers());
  }

  /**
   * Test {@link CsvOutput#withHeaders(List, boolean)}.
   *
   * <ul>
   *   <li>Given safe {@link PipedWriter#PipedWriter()}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#withHeaders(List, boolean)}
   */
  @Test
  @DisplayName(
      "Test withHeaders(List, boolean); given safe PipedWriter(); when ArrayList(); then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvOutput.CsvRowOutputWithHeaders CsvOutput.withHeaders(List, boolean)"})
  void testWithHeaders_givenSafePipedWriter_whenArrayList_thenThrowUncheckedIOException() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new PipedWriter());

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> safeResult.withHeaders(new ArrayList<>(), true));
  }

  /**
   * Test {@link CsvOutput#withHeaders(List, boolean)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return headers is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#withHeaders(List, boolean)}
   */
  @Test
  @DisplayName(
      "Test withHeaders(List, boolean); when ArrayList(); then return headers is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvOutput.CsvRowOutputWithHeaders CsvOutput.withHeaders(List, boolean)"})
  void testWithHeaders_whenArrayList_thenReturnHeadersIsArrayList() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new CharArrayWriter());
    ArrayList<String> headers = new ArrayList<>();

    // Act and Assert
    assertEquals(headers, safeResult.withHeaders(headers, true).headers());
  }

  /**
   * Test {@link CsvOutput#writeLines(Iterable, boolean)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()}.
   *   <li>When {@link ArrayList#ArrayList()} add {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeLines(Iterable, boolean)}
   */
  @Test
  @DisplayName(
      "Test writeLines(Iterable, boolean); given ArrayList(); when ArrayList() add ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CsvOutput.writeLines(Iterable, boolean)"})
  void testWriteLines_givenArrayList_whenArrayListAddArrayList() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new PipedWriter());

    ArrayList<List<String>> lines = new ArrayList<>();
    lines.add(new ArrayList<>());

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> safeResult.writeLines(lines, true));
  }

  /**
   * Test {@link CsvOutput#writeLines(Iterable, boolean)}.
   *
   * <ul>
   *   <li>Given safe {@link CharArrayWriter#CharArrayWriter()}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeLines(Iterable, boolean)}
   */
  @Test
  @DisplayName(
      "Test writeLines(Iterable, boolean); given safe CharArrayWriter(); when ArrayList(); then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CsvOutput.writeLines(Iterable, boolean)"})
  void testWriteLines_givenSafeCharArrayWriter_whenArrayList_thenDoesNotThrow() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new CharArrayWriter());

    // Act and Assert
    assertDoesNotThrow(() -> safeResult.writeLines(new ArrayList<>(), true));
  }

  /**
   * Test {@link CsvOutput#writeLine(List, boolean)} with {@code line}, {@code alwaysQuote}.
   *
   * <ul>
   *   <li>Given empty string.
   *   <li>When {@link ArrayList#ArrayList()} add empty string.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeLine(List, boolean)}
   */
  @Test
  @DisplayName(
      "Test writeLine(List, boolean) with 'line', 'alwaysQuote'; given empty string; when ArrayList() add empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CsvOutput.writeLine(List, boolean)"})
  void testWriteLineWithLineAlwaysQuote_givenEmptyString_whenArrayListAddEmptyString() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new CharArrayWriter());

    ArrayList<String> line = new ArrayList<>();
    line.add("");

    // Act and Assert
    assertDoesNotThrow(() -> safeResult.writeLine(line, false));
  }

  /**
   * Test {@link CsvOutput#writeLine(List, boolean)} with {@code line}, {@code alwaysQuote}.
   *
   * <ul>
   *   <li>Given {@code line}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code line}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeLine(List, boolean)}
   */
  @Test
  @DisplayName(
      "Test writeLine(List, boolean) with 'line', 'alwaysQuote'; given 'line'; when ArrayList() add 'line'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CsvOutput.writeLine(List, boolean)"})
  void testWriteLineWithLineAlwaysQuote_givenLine_whenArrayListAddLine_thenDoesNotThrow() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new CharArrayWriter());

    ArrayList<String> line = new ArrayList<>();
    line.add("line");

    // Act and Assert
    assertDoesNotThrow(() -> safeResult.writeLine(line, true));
  }

  /**
   * Test {@link CsvOutput#writeLine(List, boolean)} with {@code line}, {@code alwaysQuote}.
   *
   * <ul>
   *   <li>Given {@code "}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeLine(List, boolean)}
   */
  @Test
  @DisplayName("Test writeLine(List, boolean) with 'line', 'alwaysQuote'; given '\"'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CsvOutput.writeLine(List, boolean)"})
  void testWriteLineWithLineAlwaysQuote_givenQuotationMark() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new CharArrayWriter());

    ArrayList<String> line = new ArrayList<>();
    line.add("\"");
    line.add("line");

    // Act and Assert
    assertDoesNotThrow(() -> safeResult.writeLine(line, true));
  }

  /**
   * Test {@link CsvOutput#writeLine(List, boolean)} with {@code line}, {@code alwaysQuote}.
   *
   * <ul>
   *   <li>Given {@code "}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeLine(List, boolean)}
   */
  @Test
  @DisplayName("Test writeLine(List, boolean) with 'line', 'alwaysQuote'; given '\"'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CsvOutput.writeLine(List, boolean)"})
  void testWriteLineWithLineAlwaysQuote_givenQuotationMark2() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new CharArrayWriter());

    ArrayList<String> line = new ArrayList<>();
    line.add("\"");
    line.add("line");

    // Act and Assert
    assertDoesNotThrow(() -> safeResult.writeLine(line, false));
  }

  /**
   * Test {@link CsvOutput#writeLine(List, boolean)} with {@code line}, {@code alwaysQuote}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeLine(List, boolean)}
   */
  @Test
  @DisplayName(
      "Test writeLine(List, boolean) with 'line', 'alwaysQuote'; then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CsvOutput.writeLine(List, boolean)"})
  void testWriteLineWithLineAlwaysQuote_thenThrowUncheckedIOException() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new PipedWriter());

    ArrayList<String> line = new ArrayList<>();
    line.add("line");

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> safeResult.writeLine(line, true));
  }

  /**
   * Test {@link CsvOutput#writeLine(List, boolean)} with {@code line}, {@code alwaysQuote}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeLine(List, boolean)}
   */
  @Test
  @DisplayName(
      "Test writeLine(List, boolean) with 'line', 'alwaysQuote'; then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CsvOutput.writeLine(List, boolean)"})
  void testWriteLineWithLineAlwaysQuote_thenThrowUncheckedIOException2() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new PipedWriter());

    ArrayList<String> line = new ArrayList<>();
    line.add("line");

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> safeResult.writeLine(line, false));
  }

  /**
   * Test {@link CsvOutput#writeLine(List, boolean)} with {@code line}, {@code alwaysQuote}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeLine(List, boolean)}
   */
  @Test
  @DisplayName(
      "Test writeLine(List, boolean) with 'line', 'alwaysQuote'; when ArrayList(); then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CsvOutput.writeLine(List, boolean)"})
  void testWriteLineWithLineAlwaysQuote_whenArrayList_thenDoesNotThrow() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new CharArrayWriter());

    // Act and Assert
    assertDoesNotThrow(() -> safeResult.writeLine(new ArrayList<>(), true));
  }

  /**
   * Test {@link CsvOutput#writeLine(List, boolean)} with {@code line}, {@code alwaysQuote}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeLine(List, boolean)}
   */
  @Test
  @DisplayName(
      "Test writeLine(List, boolean) with 'line', 'alwaysQuote'; when ArrayList(); then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CsvOutput.writeLine(List, boolean)"})
  void testWriteLineWithLineAlwaysQuote_whenArrayList_thenThrowUncheckedIOException() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new PipedWriter());

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> safeResult.writeLine(new ArrayList<>(), true));
  }

  /**
   * Test {@link CsvOutput#writeLine(List)} with {@code line}.
   *
   * <ul>
   *   <li>Given empty string.
   *   <li>When {@link ArrayList#ArrayList()} add empty string.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeLine(List)}
   */
  @Test
  @DisplayName(
      "Test writeLine(List) with 'line'; given empty string; when ArrayList() add empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CsvOutput.writeLine(List)"})
  void testWriteLineWithLine_givenEmptyString_whenArrayListAddEmptyString() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new CharArrayWriter());

    ArrayList<String> line = new ArrayList<>();
    line.add("");

    // Act and Assert
    assertDoesNotThrow(() -> safeResult.writeLine(line));
  }

  /**
   * Test {@link CsvOutput#writeLine(List)} with {@code line}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code foo}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeLine(List)}
   */
  @Test
  @DisplayName(
      "Test writeLine(List) with 'line'; given 'foo'; when ArrayList() add 'foo'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CsvOutput.writeLine(List)"})
  void testWriteLineWithLine_givenFoo_whenArrayListAddFoo_thenDoesNotThrow() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new CharArrayWriter());

    ArrayList<String> line = new ArrayList<>();
    line.add("foo");
    line.add("line");

    // Act and Assert
    assertDoesNotThrow(() -> safeResult.writeLine(line));
  }

  /**
   * Test {@link CsvOutput#writeLine(List)} with {@code line}.
   *
   * <ul>
   *   <li>Given {@code line}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code line}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeLine(List)}
   */
  @Test
  @DisplayName(
      "Test writeLine(List) with 'line'; given 'line'; when ArrayList() add 'line'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CsvOutput.writeLine(List)"})
  void testWriteLineWithLine_givenLine_whenArrayListAddLine_thenDoesNotThrow() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new CharArrayWriter());

    ArrayList<String> line = new ArrayList<>();
    line.add("line");

    // Act and Assert
    assertDoesNotThrow(() -> safeResult.writeLine(line));
  }

  /**
   * Test {@link CsvOutput#writeLine(List)} with {@code line}.
   *
   * <ul>
   *   <li>Given safe {@link CharArrayWriter#CharArrayWriter()}.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeLine(List)}
   */
  @Test
  @DisplayName(
      "Test writeLine(List) with 'line'; given safe CharArrayWriter(); when ArrayList(); then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CsvOutput.writeLine(List)"})
  void testWriteLineWithLine_givenSafeCharArrayWriter_whenArrayList_thenDoesNotThrow() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new CharArrayWriter());

    // Act and Assert
    assertDoesNotThrow(() -> safeResult.writeLine(new ArrayList<>()));
  }

  /**
   * Test {@link CsvOutput#writeLine(List)} with {@code line}.
   *
   * <ul>
   *   <li>Given safe {@link PipedWriter#PipedWriter()}.
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeLine(List)}
   */
  @Test
  @DisplayName(
      "Test writeLine(List) with 'line'; given safe PipedWriter(); then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CsvOutput.writeLine(List)"})
  void testWriteLineWithLine_givenSafePipedWriter_thenThrowUncheckedIOException() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new PipedWriter());

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> safeResult.writeLine(new ArrayList<>()));
  }

  /**
   * Test {@link CsvOutput#writeLine(List)} with {@code line}.
   *
   * <ul>
   *   <li>Given safe {@link PipedWriter#PipedWriter()}.
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeLine(List)}
   */
  @Test
  @DisplayName(
      "Test writeLine(List) with 'line'; given safe PipedWriter(); then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CsvOutput.writeLine(List)"})
  void testWriteLineWithLine_givenSafePipedWriter_thenThrowUncheckedIOException2() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new PipedWriter());

    ArrayList<String> line = new ArrayList<>();
    line.add("line");

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> safeResult.writeLine(line));
  }

  /**
   * Test {@link CsvOutput#writeCsvFile(CsvFile, boolean)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code line}.
   *   <li>When {@link ArrayList#ArrayList()} add {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeCsvFile(CsvFile, boolean)}
   */
  @Test
  @DisplayName(
      "Test writeCsvFile(CsvFile, boolean); given ArrayList() add 'line'; when ArrayList() add ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CsvOutput.writeCsvFile(CsvFile, boolean)"})
  void testWriteCsvFile_givenArrayListAddLine_whenArrayListAddArrayList() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new CharArrayWriter());

    ArrayList<String> stringList = new ArrayList<>();
    stringList.add("line");

    ArrayList<List<String>> rows = new ArrayList<>();
    rows.add(stringList);
    CsvFile file = CsvFile.of(new ArrayList<>(), rows);

    // Act and Assert
    assertDoesNotThrow(() -> safeResult.writeCsvFile(file, true));
  }

  /**
   * Test {@link CsvOutput#writeCsvFile(CsvFile, boolean)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()}.
   *   <li>When {@link ArrayList#ArrayList()} add {@link ArrayList#ArrayList()}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeCsvFile(CsvFile, boolean)}
   */
  @Test
  @DisplayName(
      "Test writeCsvFile(CsvFile, boolean); given ArrayList(); when ArrayList() add ArrayList(); then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CsvOutput.writeCsvFile(CsvFile, boolean)"})
  void testWriteCsvFile_givenArrayList_whenArrayListAddArrayList_thenDoesNotThrow() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new CharArrayWriter());

    ArrayList<List<String>> rows = new ArrayList<>();
    rows.add(new ArrayList<>());
    CsvFile file = CsvFile.of(new ArrayList<>(), rows);

    // Act and Assert
    assertDoesNotThrow(() -> safeResult.writeCsvFile(file, true));
  }

  /**
   * Test {@link CsvOutput#writeCsvFile(CsvFile, boolean)}.
   *
   * <ul>
   *   <li>Given empty string.
   *   <li>When {@link ArrayList#ArrayList()} add empty string.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeCsvFile(CsvFile, boolean)}
   */
  @Test
  @DisplayName(
      "Test writeCsvFile(CsvFile, boolean); given empty string; when ArrayList() add empty string; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CsvOutput.writeCsvFile(CsvFile, boolean)"})
  void testWriteCsvFile_givenEmptyString_whenArrayListAddEmptyString_thenDoesNotThrow() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new CharArrayWriter());

    ArrayList<String> headers = new ArrayList<>();
    headers.add("");
    CsvFile file = CsvFile.of(headers, new ArrayList<>());

    // Act and Assert
    assertDoesNotThrow(() -> safeResult.writeCsvFile(file, true));
  }

  /**
   * Test {@link CsvOutput#writeCsvFile(CsvFile, boolean)}.
   *
   * <ul>
   *   <li>Given {@code line}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code line}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeCsvFile(CsvFile, boolean)}
   */
  @Test
  @DisplayName(
      "Test writeCsvFile(CsvFile, boolean); given 'line'; when ArrayList() add 'line'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CsvOutput.writeCsvFile(CsvFile, boolean)"})
  void testWriteCsvFile_givenLine_whenArrayListAddLine_thenDoesNotThrow() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new CharArrayWriter());

    ArrayList<String> headers = new ArrayList<>();
    headers.add("line");
    CsvFile file = CsvFile.of(headers, new ArrayList<>());

    // Act and Assert
    assertDoesNotThrow(() -> safeResult.writeCsvFile(file, true));
  }

  /**
   * Test {@link CsvOutput#writeCsvFile(CsvFile, boolean)}.
   *
   * <ul>
   *   <li>Given {@code line}.
   *   <li>When {@code false}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeCsvFile(CsvFile, boolean)}
   */
  @Test
  @DisplayName(
      "Test writeCsvFile(CsvFile, boolean); given 'line'; when 'false'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CsvOutput.writeCsvFile(CsvFile, boolean)"})
  void testWriteCsvFile_givenLine_whenFalse_thenDoesNotThrow() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new CharArrayWriter());

    ArrayList<String> headers = new ArrayList<>();
    headers.add("line");
    CsvFile file = CsvFile.of(headers, new ArrayList<>());

    // Act and Assert
    assertDoesNotThrow(() -> safeResult.writeCsvFile(file, false));
  }

  /**
   * Test {@link CsvOutput#writeCsvFile(CsvFile, boolean)}.
   *
   * <ul>
   *   <li>Given {@code "}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code "}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeCsvFile(CsvFile, boolean)}
   */
  @Test
  @DisplayName("Test writeCsvFile(CsvFile, boolean); given '\"'; when ArrayList() add '\"'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CsvOutput.writeCsvFile(CsvFile, boolean)"})
  void testWriteCsvFile_givenQuotationMark_whenArrayListAddQuotationMark() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new CharArrayWriter());

    ArrayList<String> headers = new ArrayList<>();
    headers.add("\"");
    headers.add("line");
    CsvFile file = CsvFile.of(headers, new ArrayList<>());

    // Act and Assert
    assertDoesNotThrow(() -> safeResult.writeCsvFile(file, true));
  }

  /**
   * Test {@link CsvOutput#writeCsvFile(CsvFile, boolean)}.
   *
   * <ul>
   *   <li>Given {@code "}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code "}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeCsvFile(CsvFile, boolean)}
   */
  @Test
  @DisplayName("Test writeCsvFile(CsvFile, boolean); given '\"'; when ArrayList() add '\"'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CsvOutput.writeCsvFile(CsvFile, boolean)"})
  void testWriteCsvFile_givenQuotationMark_whenArrayListAddQuotationMark2() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new CharArrayWriter());

    ArrayList<String> headers = new ArrayList<>();
    headers.add("\"");
    headers.add("line");
    CsvFile file = CsvFile.of(headers, new ArrayList<>());

    // Act and Assert
    assertDoesNotThrow(() -> safeResult.writeCsvFile(file, false));
  }

  /**
   * Test {@link CsvOutput#writeCsvFile(CsvFile, boolean)}.
   *
   * <ul>
   *   <li>Given safe {@link CharArrayWriter#CharArrayWriter()}.
   *   <li>When {@code true}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeCsvFile(CsvFile, boolean)}
   */
  @Test
  @DisplayName(
      "Test writeCsvFile(CsvFile, boolean); given safe CharArrayWriter(); when 'true'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CsvOutput.writeCsvFile(CsvFile, boolean)"})
  void testWriteCsvFile_givenSafeCharArrayWriter_whenTrue_thenDoesNotThrow() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new CharArrayWriter());
    ArrayList<String> headers = new ArrayList<>();
    CsvFile file = CsvFile.of(headers, new ArrayList<>());

    // Act and Assert
    assertDoesNotThrow(() -> safeResult.writeCsvFile(file, true));
  }

  /**
   * Test {@link CsvOutput#writeCsvFile(CsvFile, boolean)}.
   *
   * <ul>
   *   <li>Given safe {@link PipedWriter#PipedWriter()}.
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeCsvFile(CsvFile, boolean)}
   */
  @Test
  @DisplayName(
      "Test writeCsvFile(CsvFile, boolean); given safe PipedWriter(); then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CsvOutput.writeCsvFile(CsvFile, boolean)"})
  void testWriteCsvFile_givenSafePipedWriter_thenThrowUncheckedIOException() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new PipedWriter());

    ArrayList<String> headers = new ArrayList<>();
    headers.add("line");
    CsvFile file = CsvFile.of(headers, new ArrayList<>());

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> safeResult.writeCsvFile(file, true));
  }

  /**
   * Test {@link CsvOutput#writeCsvFile(CsvFile, boolean)}.
   *
   * <ul>
   *   <li>Given safe {@link PipedWriter#PipedWriter()}.
   *   <li>When {@code false}.
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeCsvFile(CsvFile, boolean)}
   */
  @Test
  @DisplayName(
      "Test writeCsvFile(CsvFile, boolean); given safe PipedWriter(); when 'false'; then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CsvOutput.writeCsvFile(CsvFile, boolean)"})
  void testWriteCsvFile_givenSafePipedWriter_whenFalse_thenThrowUncheckedIOException() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new PipedWriter());

    ArrayList<String> headers = new ArrayList<>();
    headers.add("line");
    CsvFile file = CsvFile.of(headers, new ArrayList<>());

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> safeResult.writeCsvFile(file, false));
  }

  /**
   * Test {@link CsvOutput#writeCsvFile(CsvFile, boolean)}.
   *
   * <ul>
   *   <li>Given safe {@link PipedWriter#PipedWriter()}.
   *   <li>When {@code true}.
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeCsvFile(CsvFile, boolean)}
   */
  @Test
  @DisplayName(
      "Test writeCsvFile(CsvFile, boolean); given safe PipedWriter(); when 'true'; then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CsvOutput.writeCsvFile(CsvFile, boolean)"})
  void testWriteCsvFile_givenSafePipedWriter_whenTrue_thenThrowUncheckedIOException() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new PipedWriter());
    ArrayList<String> headers = new ArrayList<>();
    CsvFile file = CsvFile.of(headers, new ArrayList<>());

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> safeResult.writeCsvFile(file, true));
  }

  /**
   * Test {@link CsvOutput#writeCell(String, boolean)} with {@code cell}, {@code alwaysQuote}.
   *
   * <ul>
   *   <li>Then return safe {@link CharArrayWriter#CharArrayWriter()}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeCell(String, boolean)}
   */
  @Test
  @DisplayName(
      "Test writeCell(String, boolean) with 'cell', 'alwaysQuote'; then return safe CharArrayWriter()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvOutput CsvOutput.writeCell(String, boolean)"})
  void testWriteCellWithCellAlwaysQuote_thenReturnSafeCharArrayWriter() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new CharArrayWriter());

    // Act
    CsvOutput actualWriteCellResult = safeResult.writeCell("Cell", true);

    // Assert
    assertSame(safeResult, actualWriteCellResult);
  }

  /**
   * Test {@link CsvOutput#writeCell(String, boolean)} with {@code cell}, {@code alwaysQuote}.
   *
   * <ul>
   *   <li>When {@code Cell}.
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeCell(String, boolean)}
   */
  @Test
  @DisplayName(
      "Test writeCell(String, boolean) with 'cell', 'alwaysQuote'; when 'Cell'; then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvOutput CsvOutput.writeCell(String, boolean)"})
  void testWriteCellWithCellAlwaysQuote_whenCell_thenThrowUncheckedIOException() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new PipedWriter());

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> safeResult.writeCell("Cell", true));
  }

  /**
   * Test {@link CsvOutput#writeCell(String, boolean)} with {@code cell}, {@code alwaysQuote}.
   *
   * <ul>
   *   <li>When {@code Cell}.
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeCell(String, boolean)}
   */
  @Test
  @DisplayName(
      "Test writeCell(String, boolean) with 'cell', 'alwaysQuote'; when 'Cell'; then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvOutput CsvOutput.writeCell(String, boolean)"})
  void testWriteCellWithCellAlwaysQuote_whenCell_thenThrowUncheckedIOException2() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new PipedWriter());

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> safeResult.writeCell("Cell", false));
  }

  /**
   * Test {@link CsvOutput#writeCell(String, boolean)} with {@code cell}, {@code alwaysQuote}.
   *
   * <ul>
   *   <li>When {@code ,}.
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeCell(String, boolean)}
   */
  @Test
  @DisplayName(
      "Test writeCell(String, boolean) with 'cell', 'alwaysQuote'; when ','; then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvOutput CsvOutput.writeCell(String, boolean)"})
  void testWriteCellWithCellAlwaysQuote_whenComma_thenThrowUncheckedIOException() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new PipedWriter());

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> safeResult.writeCell(",", false));
  }

  /**
   * Test {@link CsvOutput#writeCell(String, boolean)} with {@code cell}, {@code alwaysQuote}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return safe {@link CharArrayWriter#CharArrayWriter()}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeCell(String, boolean)}
   */
  @Test
  @DisplayName(
      "Test writeCell(String, boolean) with 'cell', 'alwaysQuote'; when empty string; then return safe CharArrayWriter()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvOutput CsvOutput.writeCell(String, boolean)"})
  void testWriteCellWithCellAlwaysQuote_whenEmptyString_thenReturnSafeCharArrayWriter() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new CharArrayWriter());

    // Act
    CsvOutput actualWriteCellResult = safeResult.writeCell("", false);

    // Assert
    assertSame(safeResult, actualWriteCellResult);
  }

  /**
   * Test {@link CsvOutput#writeCell(String)} with {@code cell}.
   *
   * <ul>
   *   <li>Given safe {@link PipedWriter#PipedWriter()}.
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeCell(String)}
   */
  @Test
  @DisplayName(
      "Test writeCell(String) with 'cell'; given safe PipedWriter(); then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvOutput CsvOutput.writeCell(String)"})
  void testWriteCellWithCell_givenSafePipedWriter_thenThrowUncheckedIOException() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new PipedWriter());

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> safeResult.writeCell("Cell"));
  }

  /**
   * Test {@link CsvOutput#writeCell(String)} with {@code cell}.
   *
   * <ul>
   *   <li>Given safe {@link PipedWriter#PipedWriter()}.
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeCell(String)}
   */
  @Test
  @DisplayName(
      "Test writeCell(String) with 'cell'; given safe PipedWriter(); then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvOutput CsvOutput.writeCell(String)"})
  void testWriteCellWithCell_givenSafePipedWriter_thenThrowUncheckedIOException2() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new PipedWriter());

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> safeResult.writeCell(","));
  }

  /**
   * Test {@link CsvOutput#writeCell(String)} with {@code cell}.
   *
   * <ul>
   *   <li>When {@code Cell}.
   *   <li>Then return safe {@link CharArrayWriter#CharArrayWriter()}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeCell(String)}
   */
  @Test
  @DisplayName(
      "Test writeCell(String) with 'cell'; when 'Cell'; then return safe CharArrayWriter()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvOutput CsvOutput.writeCell(String)"})
  void testWriteCellWithCell_whenCell_thenReturnSafeCharArrayWriter() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new CharArrayWriter());

    // Act
    CsvOutput actualWriteCellResult = safeResult.writeCell("Cell");

    // Assert
    assertSame(safeResult, actualWriteCellResult);
  }

  /**
   * Test {@link CsvOutput#writeCell(String)} with {@code cell}.
   *
   * <ul>
   *   <li>When {@code ,}.
   *   <li>Then return safe {@link CharArrayWriter#CharArrayWriter()}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeCell(String)}
   */
  @Test
  @DisplayName("Test writeCell(String) with 'cell'; when ','; then return safe CharArrayWriter()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvOutput CsvOutput.writeCell(String)"})
  void testWriteCellWithCell_whenComma_thenReturnSafeCharArrayWriter() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new CharArrayWriter());

    // Act
    CsvOutput actualWriteCellResult = safeResult.writeCell(",");

    // Assert
    assertSame(safeResult, actualWriteCellResult);
  }

  /**
   * Test {@link CsvOutput#writeCell(String)} with {@code cell}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return safe {@link CharArrayWriter#CharArrayWriter()}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeCell(String)}
   */
  @Test
  @DisplayName(
      "Test writeCell(String) with 'cell'; when empty string; then return safe CharArrayWriter()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvOutput CsvOutput.writeCell(String)"})
  void testWriteCellWithCell_whenEmptyString_thenReturnSafeCharArrayWriter() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new CharArrayWriter());

    // Act
    CsvOutput actualWriteCellResult = safeResult.writeCell("");

    // Assert
    assertSame(safeResult, actualWriteCellResult);
  }

  /**
   * Test {@link CsvOutput#writeNewLine()}.
   *
   * <ul>
   *   <li>Given safe {@link CharArrayWriter#CharArrayWriter()}.
   *   <li>Then return safe {@link CharArrayWriter#CharArrayWriter()}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeNewLine()}
   */
  @Test
  @DisplayName(
      "Test writeNewLine(); given safe CharArrayWriter(); then return safe CharArrayWriter()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvOutput CsvOutput.writeNewLine()"})
  void testWriteNewLine_givenSafeCharArrayWriter_thenReturnSafeCharArrayWriter() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new CharArrayWriter());

    // Act
    CsvOutput actualWriteNewLineResult = safeResult.writeNewLine();

    // Assert
    assertSame(safeResult, actualWriteNewLineResult);
  }

  /**
   * Test {@link CsvOutput#writeNewLine()}.
   *
   * <ul>
   *   <li>Given safe {@link PipedWriter#PipedWriter()}.
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link CsvOutput#writeNewLine()}
   */
  @Test
  @DisplayName("Test writeNewLine(); given safe PipedWriter(); then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvOutput CsvOutput.writeNewLine()"})
  void testWriteNewLine_givenSafePipedWriter_thenThrowUncheckedIOException() {
    // Arrange
    CsvOutput safeResult = CsvOutput.safe(new PipedWriter());

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> safeResult.writeNewLine());
  }
}
