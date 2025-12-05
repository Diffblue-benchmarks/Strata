package com.opengamma.strata.collect.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.io.CharSource;
import com.opengamma.strata.collect.io.UnicodeBom.UnicodeBomCharSource;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.FileDescriptor;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.UncheckedIOException;
import java.io.UnsupportedEncodingException;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CsvIteratorDiffblueTest {
  /**
   * Test {@link CsvIterator#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean)}
   */
  @Test
  @DisplayName("Test of(Reader, boolean) with 'reader', 'headerRow'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            CsvIterator.of(
                new CharArrayReader(",\u0001,\u0001,\u0001,\u0001".toCharArray()), true));
  }

  /**
   * Test {@link CsvIterator#of(Reader, boolean, char)} with {@code reader}, {@code headerRow},
   * {@code separator}.
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName("Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator() throws UnsupportedEncodingException {
    // Arrange
    InputStreamReader reader =
        new InputStreamReader(new ByteArrayInputStream("AXAXAXAX".getBytes("UTF-8")));

    // Act
    CsvIterator actualOfResult = CsvIterator.of(reader, true, 'A');

    // Assert
    Stream<String> linesResult = new BufferedReader(reader).lines();
    assertEquals("", linesResult.collect(Collectors.joining("\n")));
    assertFalse(actualOfResult.hasNext());
  }

  /**
   * Test {@link CsvIterator#of(Reader, boolean, char)} with {@code reader}, {@code headerRow},
   * {@code separator}.
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName("Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator2() throws UnsupportedEncodingException {
    // Arrange
    InputStreamReader reader =
        new InputStreamReader(new ByteArrayInputStream(" XAXAXAX".getBytes("UTF-8")));

    // Act
    CsvIterator actualOfResult = CsvIterator.of(reader, true, 'A');

    // Assert
    Stream<String> linesResult = new BufferedReader(reader).lines();
    assertEquals("", linesResult.collect(Collectors.joining("\n")));
    assertFalse(actualOfResult.hasNext());
  }

  /**
   * Test {@link CsvIterator#of(Reader, boolean, char)} with {@code reader}, {@code headerRow},
   * {@code separator}.
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName("Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator3() throws UnsupportedEncodingException {
    // Arrange
    InputStreamReader reader =
        new InputStreamReader(new ByteArrayInputStream("=XAXAXAX".getBytes("UTF-8")));

    // Act
    CsvIterator actualOfResult = CsvIterator.of(reader, true, 'A');

    // Assert
    Stream<String> linesResult = new BufferedReader(reader).lines();
    assertEquals("", linesResult.collect(Collectors.joining("\n")));
    assertFalse(actualOfResult.hasNext());
  }

  /**
   * Test {@link CsvIterator#of(Reader, boolean, char)} with {@code reader}, {@code headerRow},
   * {@code separator}.
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName("Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator4() throws UnsupportedEncodingException {
    // Arrange
    InputStreamReader reader =
        new InputStreamReader(new ByteArrayInputStream("AXAXAXA=".getBytes("UTF-8")));

    // Act
    CsvIterator actualOfResult = CsvIterator.of(reader, true, 'A');

    // Assert
    Stream<String> linesResult = new BufferedReader(reader).lines();
    assertEquals("", linesResult.collect(Collectors.joining("\n")));
    assertFalse(actualOfResult.hasNext());
  }

  /**
   * Test {@link CsvIterator#of(Reader, boolean, char)} with {@code reader}, {@code headerRow},
   * {@code separator}.
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName("Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator5() throws UnsupportedEncodingException {
    // Arrange
    InputStreamReader reader =
        new InputStreamReader(new ByteArrayInputStream("\"XAXAXAX".getBytes("UTF-8")));

    // Act
    CsvIterator actualOfResult = CsvIterator.of(reader, true, 'A');

    // Assert
    Stream<String> linesResult = new BufferedReader(reader).lines();
    assertEquals("", linesResult.collect(Collectors.joining("\n")));
    assertFalse(actualOfResult.hasNext());
  }

  /**
   * Test {@link CsvIterator#of(Reader, boolean, char)} with {@code reader}, {@code headerRow},
   * {@code separator}.
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName("Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator6() throws UnsupportedEncodingException {
    // Arrange
    InputStreamReader reader =
        new InputStreamReader(new ByteArrayInputStream("=XAXXXAX".getBytes("UTF-8")));

    // Act
    CsvIterator actualOfResult = CsvIterator.of(reader, true, 'A');

    // Assert
    Stream<String> linesResult = new BufferedReader(reader).lines();
    assertEquals("", linesResult.collect(Collectors.joining("\n")));
    assertFalse(actualOfResult.hasNext());
  }

  /**
   * Test {@link CsvIterator#of(Reader, boolean, char)} with {@code reader}, {@code headerRow},
   * {@code separator}.
   *
   * <ul>
   *   <li>When {@link ByteArrayInputStream#ByteArrayInputStream(byte[])} with {@code ="AXAXAX}
   *       Bytes is {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'; when ByteArrayInputStream(byte[]) with '=\"AXAXAX' Bytes is 'UTF-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator_whenByteArrayInputStreamWithAxaxaxBytesIsUtf8()
      throws UnsupportedEncodingException {
    // Arrange
    InputStreamReader reader =
        new InputStreamReader(new ByteArrayInputStream("=\"AXAXAX".getBytes("UTF-8")));

    // Act
    CsvIterator actualOfResult = CsvIterator.of(reader, true, 'A');

    // Assert
    Stream<String> linesResult = new BufferedReader(reader).lines();
    assertEquals("", linesResult.collect(Collectors.joining("\n")));
    assertFalse(actualOfResult.hasNext());
  }

  /**
   * Test {@link CsvIterator#of(Reader, boolean, char)} with {@code reader}, {@code headerRow},
   * {@code separator}.
   *
   * <ul>
   *   <li>When {@link ByteArrayInputStream#ByteArrayInputStream(byte[])} with {@code ""AXAXAX}
   *       Bytes is {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'; when ByteArrayInputStream(byte[]) with '\"\"AXAXAX' Bytes is 'UTF-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator_whenByteArrayInputStreamWithAxaxaxBytesIsUtf82()
      throws UnsupportedEncodingException {
    // Arrange
    InputStreamReader reader =
        new InputStreamReader(new ByteArrayInputStream("\"\"AXAXAX".getBytes("UTF-8")));

    // Act
    CsvIterator actualOfResult = CsvIterator.of(reader, true, 'A');

    // Assert
    Stream<String> linesResult = new BufferedReader(reader).lines();
    assertEquals("", linesResult.collect(Collectors.joining("\n")));
    assertFalse(actualOfResult.hasNext());
  }

  /**
   * Test {@link CsvIterator#of(Reader, boolean, char)} with {@code reader}, {@code headerRow},
   * {@code separator}.
   *
   * <ul>
   *   <li>When {@link ByteArrayInputStream#ByteArrayInputStream(byte[])} with {@code "XAXAXA"}
   *       Bytes is {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'; when ByteArrayInputStream(byte[]) with '\"XAXAXA\"' Bytes is 'UTF-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator_whenByteArrayInputStreamWithXaxaxaBytesIsUtf8()
      throws UnsupportedEncodingException {
    // Arrange
    InputStreamReader reader =
        new InputStreamReader(new ByteArrayInputStream("\"XAXAXA\"".getBytes("UTF-8")));

    // Act
    CsvIterator actualOfResult = CsvIterator.of(reader, true, 'A');

    // Assert
    Stream<String> linesResult = new BufferedReader(reader).lines();
    assertEquals("", linesResult.collect(Collectors.joining("\n")));
    assertFalse(actualOfResult.hasNext());
  }

  /**
   * Test {@link CsvIterator#of(Reader, boolean, char)} with {@code reader}, {@code headerRow},
   * {@code separator}.
   *
   * <ul>
   *   <li>When {@code f}.
   *   <li>Then return not hasNext.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'; when 'f'; then return not hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator_whenF_thenReturnNotHasNext() {
    // Arrange, Act and Assert
    assertFalse(CsvIterator.of(new StringReader("foo"), true, 'f').hasNext());
  }

  /**
   * Test {@link CsvIterator#of(Reader, boolean, char)} with {@code reader}, {@code headerRow},
   * {@code separator}.
   *
   * <ul>
   *   <li>When {@link StringReader#StringReader(String)} with {@code foo}.
   *   <li>Then return not hasNext.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'; when StringReader(String) with 'foo'; then return not hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator_whenStringReaderWithFoo_thenReturnNotHasNext() {
    // Arrange, Act and Assert
    assertFalse(CsvIterator.of(new StringReader("foo"), true, 'A').hasNext());
  }

  /**
   * Test {@link CsvIterator#of(Reader, boolean, char)} with {@code reader}, {@code headerRow},
   * {@code separator}.
   *
   * <ul>
   *   <li>When {@link StringReader#StringReader(String)} with {@code #}.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'; when StringReader(String) with '#'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator_whenStringReaderWithNumberSign() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> CsvIterator.of(new StringReader("#"), true, 'A'));
  }

  /**
   * Test {@link CsvIterator#of(Reader, boolean, char)} with {@code reader}, {@code headerRow},
   * {@code separator}.
   *
   * <ul>
   *   <li>When {@link StringReader#StringReader(String)} with {@code ;}.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'; when StringReader(String) with ';'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator_whenStringReaderWithSemicolon() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> CsvIterator.of(new StringReader(";"), true, 'A'));
  }

  /**
   * Test {@link CsvIterator#of(Reader, boolean, char)} with {@code reader}, {@code headerRow},
   * {@code separator}.
   *
   * <ul>
   *   <li>When {@link StringReader#StringReader(String)} with {@code ;}.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'; when StringReader(String) with ';'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator_whenStringReaderWithSemicolon2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> CsvIterator.of(new StringReader(";"), true, ';'));
  }

  /**
   * Test {@link CsvIterator#of(Reader, boolean, char)} with {@code reader}, {@code headerRow},
   * {@code separator}.
   *
   * <ul>
   *   <li>When {@code X}.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean, char)}
   */
  @Test
  @DisplayName("Test of(Reader, boolean, char) with 'reader', 'headerRow', 'separator'; when 'X'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean, char)"})
  void testOfWithReaderHeaderRowSeparator_whenX() {
    // Arrange
    ByteArrayInputStream byteArrayInputStream =
        new ByteArrayInputStream(new byte[] {1, 'X', 'A', 'X', 'A', 'X', 'A', 'X'});
    InputStreamReader reader = new InputStreamReader(byteArrayInputStream);

    // Act
    CsvIterator actualOfResult = CsvIterator.of(reader, true, 'A');

    // Assert
    Stream<String> linesResult = new BufferedReader(reader).lines();
    assertEquals("", linesResult.collect(Collectors.joining("\n")));
    assertFalse(actualOfResult.hasNext());
  }

  /**
   * Test {@link CsvIterator#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>Then not {@link CharArrayReader#CharArrayReader(char[])} with {@code ,A,A} toCharArray
   *       ready.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; then not CharArrayReader(char[]) with ',A,A' toCharArray ready")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_thenNotCharArrayReaderWithAAToCharArrayReady() throws IOException {
    // Arrange
    CharArrayReader reader = new CharArrayReader(",A,A".toCharArray());

    // Act and Assert
    assertFalse(CsvIterator.of(reader, true).hasNext());
    assertFalse(reader.ready());
  }

  /**
   * Test {@link CsvIterator#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>Then not {@link CharArrayReader#CharArrayReader(char[])} with {@code A,A} toCharArray
   *       ready.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; then not CharArrayReader(char[]) with 'A,A' toCharArray ready")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_thenNotCharArrayReaderWithAAToCharArrayReady2()
      throws IOException {
    // Arrange
    CharArrayReader reader = new CharArrayReader(" A,A".toCharArray());

    // Act and Assert
    assertFalse(CsvIterator.of(reader, true).hasNext());
    assertFalse(reader.ready());
  }

  /**
   * Test {@link CsvIterator#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>Then not {@link CharArrayReader#CharArrayReader(char[])} with {@code =A,A} toCharArray
   *       ready.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; then not CharArrayReader(char[]) with '=A,A' toCharArray ready")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_thenNotCharArrayReaderWithAAToCharArrayReady3()
      throws IOException {
    // Arrange
    CharArrayReader reader = new CharArrayReader("=A,A".toCharArray());

    // Act and Assert
    assertFalse(CsvIterator.of(reader, true).hasNext());
    assertFalse(reader.ready());
  }

  /**
   * Test {@link CsvIterator#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>Then not {@link CharArrayReader#CharArrayReader(char[])} with {@code "A,A} toCharArray
   *       ready.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; then not CharArrayReader(char[]) with '\"A,A' toCharArray ready")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_thenNotCharArrayReaderWithAAToCharArrayReady4()
      throws IOException {
    // Arrange
    CharArrayReader reader = new CharArrayReader("\"A,A".toCharArray());

    // Act and Assert
    assertFalse(CsvIterator.of(reader, true).hasNext());
    assertFalse(reader.ready());
  }

  /**
   * Test {@link CsvIterator#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>Then not {@link CharArrayReader#CharArrayReader(char[])} with {@code A,A} toCharArray
   *       ready.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; then not CharArrayReader(char[]) with 'A,A' toCharArray ready")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_thenNotCharArrayReaderWithAAToCharArrayReady5()
      throws IOException {
    // Arrange
    CharArrayReader reader = new CharArrayReader("\nA,A".toCharArray());

    // Act and Assert
    assertFalse(CsvIterator.of(reader, true).hasNext());
    assertFalse(reader.ready());
  }

  /**
   * Test {@link CsvIterator#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>Then not {@link CharArrayReader#CharArrayReader(char[])} with {@code ,,,A} toCharArray
   *       ready.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; then not CharArrayReader(char[]) with ',,,A' toCharArray ready")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_thenNotCharArrayReaderWithAToCharArrayReady() throws IOException {
    // Arrange
    CharArrayReader reader = new CharArrayReader(",,,A".toCharArray());

    // Act and Assert
    assertFalse(CsvIterator.of(reader, true).hasNext());
    assertFalse(reader.ready());
  }

  /**
   * Test {@link CsvIterator#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>Then not {@link CharArrayReader#CharArrayReader(char[])} with {@code ,A,=} toCharArray
   *       ready.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; then not CharArrayReader(char[]) with ',A,=' toCharArray ready")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_thenNotCharArrayReaderWithAToCharArrayReady2() throws IOException {
    // Arrange
    CharArrayReader reader = new CharArrayReader(",A,=".toCharArray());

    // Act and Assert
    assertFalse(CsvIterator.of(reader, true).hasNext());
    assertFalse(reader.ready());
  }

  /**
   * Test {@link CsvIterator#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>Then not {@link CharArrayReader#CharArrayReader(char[])} with {@code =",A} toCharArray
   *       ready.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; then not CharArrayReader(char[]) with '=\",A' toCharArray ready")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_thenNotCharArrayReaderWithAToCharArrayReady3() throws IOException {
    // Arrange
    CharArrayReader reader = new CharArrayReader("=\",A".toCharArray());

    // Act and Assert
    assertFalse(CsvIterator.of(reader, true).hasNext());
    assertFalse(reader.ready());
  }

  /**
   * Test {@link CsvIterator#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>Then not {@link CharArrayReader#CharArrayReader(char[])} with {@code "",A} toCharArray
   *       ready.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; then not CharArrayReader(char[]) with '\"\",A' toCharArray ready")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_thenNotCharArrayReaderWithAToCharArrayReady4() throws IOException {
    // Arrange
    CharArrayReader reader = new CharArrayReader("\"\",A".toCharArray());

    // Act and Assert
    assertFalse(CsvIterator.of(reader, true).hasNext());
    assertFalse(reader.ready());
  }

  /**
   * Test {@link CsvIterator#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>Then not {@link CharArrayReader#CharArrayReader(char[])} with {@code "A,"} toCharArray
   *       ready.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; then not CharArrayReader(char[]) with '\"A,\"' toCharArray ready")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_thenNotCharArrayReaderWithAToCharArrayReady5() throws IOException {
    // Arrange
    CharArrayReader reader = new CharArrayReader("\"A,\"".toCharArray());

    // Act and Assert
    assertFalse(CsvIterator.of(reader, true).hasNext());
    assertFalse(reader.ready());
  }

  /**
   * Test {@link CsvIterator#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>Then not {@link CharArrayReader#CharArrayReader(char[])} with {@code """A} toCharArray
   *       ready.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; then not CharArrayReader(char[]) with '\"\"\"A' toCharArray ready")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_thenNotCharArrayReaderWithAToCharArrayReady6() throws IOException {
    // Arrange
    CharArrayReader reader = new CharArrayReader("\"\"\"A".toCharArray());

    // Act and Assert
    assertFalse(CsvIterator.of(reader, true).hasNext());
    assertFalse(reader.ready());
  }

  /**
   * Test {@link CsvIterator#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>Then not {@link CharArrayReader#CharArrayReader(char[])} with {@code ,Z,=} toCharArray
   *       ready.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; then not CharArrayReader(char[]) with ',Z,=' toCharArray ready")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_thenNotCharArrayReaderWithZToCharArrayReady() throws IOException {
    // Arrange
    CharArrayReader reader = new CharArrayReader(",Z,=".toCharArray());

    // Act and Assert
    assertFalse(CsvIterator.of(reader, true).hasNext());
    assertFalse(reader.ready());
  }

  /**
   * Test {@link CsvIterator#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_thenThrowUncheckedIOException() {
    // Arrange, Act and Assert
    assertThrows(
        UncheckedIOException.class,
        () -> CsvIterator.of(new FileReader(new FileDescriptor()), true));
  }

  /**
   * Test {@link CsvIterator#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>When {@link StringReader#StringReader(String)} with {@code foo}.
   *   <li>Then return not hasNext.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; when StringReader(String) with 'foo'; then return not hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_whenStringReaderWithFoo_thenReturnNotHasNext() {
    // Arrange, Act and Assert
    assertFalse(CsvIterator.of(new StringReader("foo"), true).hasNext());
  }

  /**
   * Test {@link CsvIterator#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>When {@link StringReader#StringReader(String)} with {@code #}.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; when StringReader(String) with '#'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_whenStringReaderWithNumberSign() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> CsvIterator.of(new StringReader("#"), true));
  }

  /**
   * Test {@link CsvIterator#of(Reader, boolean)} with {@code reader}, {@code headerRow}.
   *
   * <ul>
   *   <li>When {@link StringReader#StringReader(String)} with {@code ;}.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(Reader, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(Reader, boolean) with 'reader', 'headerRow'; when StringReader(String) with ';'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(Reader, boolean)"})
  void testOfWithReaderHeaderRow_whenStringReaderWithSemicolon() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> CsvIterator.of(new StringReader(";"), true));
  }

  /**
   * Test {@link CsvIterator#of(CharSource, boolean, char)} with {@code source}, {@code headerRow},
   * {@code separator}.
   *
   * <p>Method under test: {@link CsvIterator#of(CharSource, boolean, char)}
   */
  @Test
  @DisplayName("Test of(CharSource, boolean, char) with 'source', 'headerRow', 'separator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(CharSource, boolean, char)"})
  void testOfWithSourceHeaderRowSeparator() {
    // Arrange, Act and Assert
    assertFalse(
        CsvIterator.of(StringCharSource.of("Resources.asByteSource("), true, 's').hasNext());
  }

  /**
   * Test {@link CsvIterator#of(CharSource, boolean, char)} with {@code source}, {@code headerRow},
   * {@code separator}.
   *
   * <ul>
   *   <li>When {@code e}.
   *   <li>Then return not hasNext.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(CharSource, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean, char) with 'source', 'headerRow', 'separator'; when 'e'; then return not hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(CharSource, boolean, char)"})
  void testOfWithSourceHeaderRowSeparator_whenE_thenReturnNotHasNext() {
    // Arrange, Act and Assert
    assertFalse(
        CsvIterator.of(StringCharSource.of("Resources.asByteSource("), true, 'e').hasNext());
  }

  /**
   * Test {@link CsvIterator#of(CharSource, boolean, char)} with {@code source}, {@code headerRow},
   * {@code separator}.
   *
   * <ul>
   *   <li>When {@link StringCharSource#EMPTY}.
   *   <li>Then return not hasNext.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(CharSource, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean, char) with 'source', 'headerRow', 'separator'; when EMPTY; then return not hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(CharSource, boolean, char)"})
  void testOfWithSourceHeaderRowSeparator_whenEmpty_thenReturnNotHasNext() {
    // Arrange, Act and Assert
    assertFalse(CsvIterator.of(StringCharSource.EMPTY, false, ';').hasNext());
  }

  /**
   * Test {@link CsvIterator#of(CharSource, boolean, char)} with {@code source}, {@code headerRow},
   * {@code separator}.
   *
   * <ul>
   *   <li>When {@link StringCharSource#EMPTY}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(CharSource, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean, char) with 'source', 'headerRow', 'separator'; when EMPTY; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(CharSource, boolean, char)"})
  void testOfWithSourceHeaderRowSeparator_whenEmpty_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> CsvIterator.of(StringCharSource.EMPTY, true, 'A'));
  }

  /**
   * Test {@link CsvIterator#of(CharSource, boolean, char)} with {@code source}, {@code headerRow},
   * {@code separator}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code #}.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(CharSource, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean, char) with 'source', 'headerRow', 'separator'; when StringCharSource with str is '#'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(CharSource, boolean, char)"})
  void testOfWithSourceHeaderRowSeparator_whenStringCharSourceWithStrIsNumberSign() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> CsvIterator.of(StringCharSource.of("#"), true, 'A'));
  }

  /**
   * Test {@link CsvIterator#of(CharSource, boolean, char)} with {@code source}, {@code headerRow},
   * {@code separator}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code ;}.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(CharSource, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean, char) with 'source', 'headerRow', 'separator'; when StringCharSource with str is ';'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(CharSource, boolean, char)"})
  void testOfWithSourceHeaderRowSeparator_whenStringCharSourceWithStrIsSemicolon() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> CsvIterator.of(StringCharSource.of(";"), true, 'A'));
  }

  /**
   * Test {@link CsvIterator#of(CharSource, boolean, char)} with {@code source}, {@code headerRow},
   * {@code separator}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code ;}.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(CharSource, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean, char) with 'source', 'headerRow', 'separator'; when StringCharSource with str is ';'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(CharSource, boolean, char)"})
  void testOfWithSourceHeaderRowSeparator_whenStringCharSourceWithStrIsSemicolon2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> CsvIterator.of(StringCharSource.of(";"), true, ';'));
  }

  /**
   * Test {@link CsvIterator#of(CharSource, boolean, char)} with {@code source}, {@code headerRow},
   * {@code separator}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code source}.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(CharSource, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean, char) with 'source', 'headerRow', 'separator'; when StringCharSource with str is 'source'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(CharSource, boolean, char)"})
  void testOfWithSourceHeaderRowSeparator_whenStringCharSourceWithStrIsSource() {
    // Arrange, Act and Assert
    assertFalse(CsvIterator.of(StringCharSource.of("source"), true, 'A').hasNext());
  }

  /**
   * Test {@link CsvIterator#of(CharSource, boolean, char)} with {@code source}, {@code headerRow},
   * {@code separator}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code source}.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(CharSource, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean, char) with 'source', 'headerRow', 'separator'; when StringCharSource with str is 'source'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(CharSource, boolean, char)"})
  void testOfWithSourceHeaderRowSeparator_whenStringCharSourceWithStrIsSource2() {
    // Arrange, Act and Assert
    assertFalse(CsvIterator.of(StringCharSource.of("source"), true, 's').hasNext());
  }

  /**
   * Test {@link CsvIterator#of(CharSource, boolean, char)} with {@code source}, {@code headerRow},
   * {@code separator}.
   *
   * <ul>
   *   <li>When {@link UnicodeBomCharSource#UnicodeBomCharSource(BeanByteSource)} with underlying is
   *       {@link ArrayByteSource#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(CharSource, boolean, char)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean, char) with 'source', 'headerRow', 'separator'; when UnicodeBomCharSource(BeanByteSource) with underlying is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(CharSource, boolean, char)"})
  void testOfWithSourceHeaderRowSeparator_whenUnicodeBomCharSourceWithUnderlyingIsEmpty() {
    // Arrange, Act and Assert
    assertFalse(
        CsvIterator.of(new UnicodeBomCharSource(ArrayByteSource.EMPTY), false, ';').hasNext());
  }

  /**
   * Test {@link CsvIterator#of(CharSource, boolean)} with {@code source}, {@code headerRow}.
   *
   * <ul>
   *   <li>When {@link StringCharSource#EMPTY}.
   *   <li>Then return not hasNext.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(CharSource, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean) with 'source', 'headerRow'; when EMPTY; then return not hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(CharSource, boolean)"})
  void testOfWithSourceHeaderRow_whenEmpty_thenReturnNotHasNext() {
    // Arrange, Act and Assert
    assertFalse(CsvIterator.of(StringCharSource.EMPTY, false).hasNext());
  }

  /**
   * Test {@link CsvIterator#of(CharSource, boolean)} with {@code source}, {@code headerRow}.
   *
   * <ul>
   *   <li>When {@link StringCharSource#EMPTY}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(CharSource, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean) with 'source', 'headerRow'; when EMPTY; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(CharSource, boolean)"})
  void testOfWithSourceHeaderRow_whenEmpty_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> CsvIterator.of(StringCharSource.EMPTY, true));
  }

  /**
   * Test {@link CsvIterator#of(CharSource, boolean)} with {@code source}, {@code headerRow}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code #}.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(CharSource, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean) with 'source', 'headerRow'; when StringCharSource with str is '#'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(CharSource, boolean)"})
  void testOfWithSourceHeaderRow_whenStringCharSourceWithStrIsNumberSign() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> CsvIterator.of(StringCharSource.of("#"), true));
  }

  /**
   * Test {@link CsvIterator#of(CharSource, boolean)} with {@code source}, {@code headerRow}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code ;}.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(CharSource, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean) with 'source', 'headerRow'; when StringCharSource with str is ';'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(CharSource, boolean)"})
  void testOfWithSourceHeaderRow_whenStringCharSourceWithStrIsSemicolon() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> CsvIterator.of(StringCharSource.of(";"), true));
  }

  /**
   * Test {@link CsvIterator#of(CharSource, boolean)} with {@code source}, {@code headerRow}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code source}.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(CharSource, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean) with 'source', 'headerRow'; when StringCharSource with str is 'source'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(CharSource, boolean)"})
  void testOfWithSourceHeaderRow_whenStringCharSourceWithStrIsSource() {
    // Arrange, Act and Assert
    assertFalse(CsvIterator.of(StringCharSource.of("source"), true).hasNext());
  }

  /**
   * Test {@link CsvIterator#of(CharSource, boolean)} with {@code source}, {@code headerRow}.
   *
   * <ul>
   *   <li>When {@link UnicodeBomCharSource#UnicodeBomCharSource(BeanByteSource)} with underlying is
   *       {@link ArrayByteSource#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link CsvIterator#of(CharSource, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource, boolean) with 'source', 'headerRow'; when UnicodeBomCharSource(BeanByteSource) with underlying is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CsvIterator CsvIterator.of(CharSource, boolean)"})
  void testOfWithSourceHeaderRow_whenUnicodeBomCharSourceWithUnderlyingIsEmpty() {
    // Arrange, Act and Assert
    assertFalse(CsvIterator.of(new UnicodeBomCharSource(ArrayByteSource.EMPTY), false).hasNext());
  }
}
