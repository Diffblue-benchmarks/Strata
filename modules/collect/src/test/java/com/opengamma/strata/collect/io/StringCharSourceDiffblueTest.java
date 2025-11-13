package com.opengamma.strata.collect.io;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.google.common.io.CharSink;
import com.google.common.io.CharSource;
import com.opengamma.strata.collect.function.CheckedSupplier;
import com.opengamma.strata.collect.io.BeanByteSource.AsBeanCharSource;
import com.opengamma.strata.collect.io.StringCharSource.Meta;
import com.opengamma.strata.collect.io.UnicodeBom.UnicodeBomCharSource;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.UncheckedIOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.Optional;
import org.joda.beans.MetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class StringCharSourceDiffblueTest {
  /**
   * Test {@link StringCharSource#of(String)}.
   *
   * <p>Method under test: {@link StringCharSource#of(String)}
   */
  @Test
  @DisplayName("Test of(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StringCharSource StringCharSource.of(String)"})
  void testOf() {
    // Arrange and Act
    StringCharSource actualOfResult = StringCharSource.of("Str");

    // Assert
    assertEquals("Str", actualOfResult.readFirstLine());
    ImmutableList<String> readLinesResult = actualOfResult.readLines();
    assertEquals(1, readLinesResult.size());
    assertEquals("Str", readLinesResult.get(0));
    assertEquals(3L, actualOfResult.length());
    assertFalse(actualOfResult.isEmpty());
    assertFalse(actualOfResult.getFileName().isPresent());
  }

  /**
   * Test {@link StringCharSource#fromBytesUtf8(byte[])}.
   *
   * <p>Method under test: {@link StringCharSource#fromBytesUtf8(byte[])}
   */
  @Test
  @DisplayName("Test fromBytesUtf8(byte[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StringCharSource StringCharSource.fromBytesUtf8(byte[])"})
  void testFromBytesUtf8() throws UnsupportedEncodingException {
    // Arrange and Act
    StringCharSource actualFromBytesUtf8Result =
        StringCharSource.fromBytesUtf8("AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals("AXAXAXAX", actualFromBytesUtf8Result.readFirstLine());
    ImmutableList<String> readLinesResult = actualFromBytesUtf8Result.readLines();
    assertEquals(1, readLinesResult.size());
    assertEquals("AXAXAXAX", readLinesResult.get(0));
    assertEquals(8L, actualFromBytesUtf8Result.length());
    assertFalse(actualFromBytesUtf8Result.isEmpty());
    assertFalse(actualFromBytesUtf8Result.getFileName().isPresent());
  }

  /**
   * Test {@link StringCharSource#fromBytes(byte[], Charset)}.
   *
   * <ul>
   *   <li>When forName {@code UTF-8}.
   *   <li>Then return readFirstLine is {@code AXAXAXAX}.
   * </ul>
   *
   * <p>Method under test: {@link StringCharSource#fromBytes(byte[], Charset)}
   */
  @Test
  @DisplayName(
      "Test fromBytes(byte[], Charset); when forName 'UTF-8'; then return readFirstLine is 'AXAXAXAX'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StringCharSource StringCharSource.fromBytes(byte[], Charset)"})
  void testFromBytes_whenForNameUtf8_thenReturnReadFirstLineIsAxaxaxax()
      throws UnsupportedEncodingException {
    // Arrange
    byte[] bytes = "AXAXAXAX".getBytes("UTF-8");

    // Act
    StringCharSource actualFromBytesResult =
        StringCharSource.fromBytes(bytes, Charset.forName("UTF-8"));

    // Assert
    assertEquals("AXAXAXAX", actualFromBytesResult.readFirstLine());
    ImmutableList<String> readLinesResult = actualFromBytesResult.readLines();
    assertEquals(1, readLinesResult.size());
    assertEquals("AXAXAXAX", readLinesResult.get(0));
    assertEquals(8L, actualFromBytesResult.length());
    assertFalse(actualFromBytesResult.isEmpty());
    assertFalse(actualFromBytesResult.getFileName().isPresent());
  }

  /**
   * Test {@link StringCharSource#from(CharSource)} with {@code other}.
   *
   * <p>Method under test: {@link StringCharSource#from(CharSource)}
   */
  @Test
  @DisplayName("Test from(CharSource) with 'other'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StringCharSource StringCharSource.from(CharSource)"})
  void testFromWithOther() {
    // Arrange
    AsBeanCharSource other = new AsBeanCharSource(ArrayByteSource.EMPTY, Charset.forName("UTF-8"));

    // Act
    StringCharSource actualFromResult = StringCharSource.from(other);

    // Assert
    assertNull(actualFromResult.readFirstLine());
    assertEquals(0L, actualFromResult.length());
    assertTrue(actualFromResult.isEmpty());
    assertTrue(actualFromResult.readLines().isEmpty());
  }

  /**
   * Test {@link StringCharSource#from(CharSource)} with {@code other}.
   *
   * <p>Method under test: {@link StringCharSource#from(CharSource)}
   */
  @Test
  @DisplayName("Test from(CharSource) with 'other'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StringCharSource StringCharSource.from(CharSource)"})
  void testFromWithOther2() {
    // Arrange and Act
    StringCharSource actualFromResult =
        StringCharSource.from(new UnicodeBomCharSource(ArrayByteSource.fromBase64("Base64")));

    // Assert
    assertEquals("\u0005�\u001e�", actualFromResult.readFirstLine());
    ImmutableList<String> readLinesResult = actualFromResult.readLines();
    assertEquals(1, readLinesResult.size());
    assertEquals("\u0005�\u001e�", readLinesResult.get(0));
    assertEquals(4L, actualFromResult.length());
    assertFalse(actualFromResult.isEmpty());
  }

  /**
   * Test {@link StringCharSource#from(CharSource)} with {@code other}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link StringCharSource#from(CharSource)}
   */
  @Test
  @DisplayName("Test from(CharSource) with 'other'; then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StringCharSource StringCharSource.from(CharSource)"})
  void testFromWithOther_thenThrowUncheckedIOException() {
    // Arrange
    FileByteSource underlying =
        FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());

    // Act and Assert
    assertThrows(
        UncheckedIOException.class,
        () -> StringCharSource.from(new UnicodeBomCharSource(underlying)));
  }

  /**
   * Test {@link StringCharSource#from(CharSource)} with {@code other}.
   *
   * <ul>
   *   <li>When {@link StringCharSource#EMPTY}.
   *   <li>Then return readFirstLine is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link StringCharSource#from(CharSource)}
   */
  @Test
  @DisplayName(
      "Test from(CharSource) with 'other'; when EMPTY; then return readFirstLine is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StringCharSource StringCharSource.from(CharSource)"})
  void testFromWithOther_whenEmpty_thenReturnReadFirstLineIsNull() {
    // Arrange and Act
    StringCharSource actualFromResult = StringCharSource.from(StringCharSource.EMPTY);

    // Assert
    assertNull(actualFromResult.readFirstLine());
    assertEquals(0L, actualFromResult.length());
    assertTrue(actualFromResult.isEmpty());
    assertTrue(actualFromResult.readLines().isEmpty());
  }

  /**
   * Test {@link StringCharSource#from(CharSource)} with {@code other}.
   *
   * <ul>
   *   <li>When {@link UnicodeBomCharSource#UnicodeBomCharSource(BeanByteSource)} with underlying is
   *       {@link ArrayByteSource#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link StringCharSource#from(CharSource)}
   */
  @Test
  @DisplayName(
      "Test from(CharSource) with 'other'; when UnicodeBomCharSource(BeanByteSource) with underlying is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StringCharSource StringCharSource.from(CharSource)"})
  void testFromWithOther_whenUnicodeBomCharSourceWithUnderlyingIsEmpty() {
    // Arrange and Act
    StringCharSource actualFromResult =
        StringCharSource.from(new UnicodeBomCharSource(ArrayByteSource.EMPTY));

    // Assert
    assertNull(actualFromResult.readFirstLine());
    assertEquals(0L, actualFromResult.length());
    assertTrue(actualFromResult.isEmpty());
    assertTrue(actualFromResult.readLines().isEmpty());
  }

  /**
   * Test {@link StringCharSource#from(CheckedSupplier)} with {@code readerSupplier}.
   *
   * <ul>
   *   <li>Given {@link StringReader#StringReader(String)} with {@code foo}.
   *   <li>Then return readFirstLine is {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link StringCharSource#from(CheckedSupplier)}
   */
  @Test
  @DisplayName(
      "Test from(CheckedSupplier) with 'readerSupplier'; given StringReader(String) with 'foo'; then return readFirstLine is 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StringCharSource StringCharSource.from(CheckedSupplier)"})
  void testFromWithReaderSupplier_givenStringReaderWithFoo_thenReturnReadFirstLineIsFoo()
      throws Throwable {
    // Arrange
    CheckedSupplier<Reader> readerSupplier = mock(CheckedSupplier.class);
    when(readerSupplier.get()).thenReturn(new StringReader("foo"));

    // Act
    StringCharSource actualFromResult = StringCharSource.from(readerSupplier);

    // Assert
    verify(readerSupplier).get();
    assertEquals("foo", actualFromResult.readFirstLine());
    ImmutableList<String> readLinesResult = actualFromResult.readLines();
    assertEquals(1, readLinesResult.size());
    assertEquals("foo", readLinesResult.get(0));
    assertEquals(3L, actualFromResult.length());
    assertFalse(actualFromResult.isEmpty());
    assertFalse(actualFromResult.getFileName().isPresent());
  }

  /**
   * Test {@link StringCharSource#from(Readable)} with {@code reader}.
   *
   * <ul>
   *   <li>When {@link StringReader#StringReader(String)} with {@code foo}.
   *   <li>Then return readFirstLine is {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link StringCharSource#from(Readable)}
   */
  @Test
  @DisplayName(
      "Test from(Readable) with 'reader'; when StringReader(String) with 'foo'; then return readFirstLine is 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StringCharSource StringCharSource.from(Readable)"})
  void testFromWithReader_whenStringReaderWithFoo_thenReturnReadFirstLineIsFoo()
      throws IOException {
    // Arrange and Act
    StringCharSource actualFromResult = StringCharSource.from(new StringReader("foo"));

    // Assert
    assertEquals("foo", actualFromResult.readFirstLine());
    ImmutableList<String> readLinesResult = actualFromResult.readLines();
    assertEquals(1, readLinesResult.size());
    assertEquals("foo", readLinesResult.get(0));
    assertEquals(3L, actualFromResult.length());
    assertFalse(actualFromResult.isEmpty());
    assertFalse(actualFromResult.getFileName().isPresent());
  }

  /**
   * Test {@link StringCharSource#StringCharSource(String, String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return not FileName Present.
   * </ul>
   *
   * <p>Method under test: {@link StringCharSource#StringCharSource(String, String)}
   */
  @Test
  @DisplayName(
      "Test new StringCharSource(String, String); when empty string; then return not FileName Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void StringCharSource.<init>(String, String)"})
  void testNewStringCharSource_whenEmptyString_thenReturnNotFileNamePresent() {
    // Arrange and Act
    StringCharSource actualStringCharSource = new StringCharSource("42", "");

    // Assert
    assertEquals("42", actualStringCharSource.readFirstLine());
    ImmutableList<String> readLinesResult = actualStringCharSource.readLines();
    assertEquals(1, readLinesResult.size());
    assertEquals("42", readLinesResult.get(0));
    assertEquals(2L, actualStringCharSource.length());
    assertFalse(actualStringCharSource.isEmpty());
    assertFalse(actualStringCharSource.getFileName().isPresent());
  }

  /**
   * Test {@link StringCharSource#StringCharSource(String, String)}.
   *
   * <ul>
   *   <li>When {@code foo.txt}.
   *   <li>Then return FileNameOrThrow is {@code foo.txt}.
   * </ul>
   *
   * <p>Method under test: {@link StringCharSource#StringCharSource(String, String)}
   */
  @Test
  @DisplayName(
      "Test new StringCharSource(String, String); when 'foo.txt'; then return FileNameOrThrow is 'foo.txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void StringCharSource.<init>(String, String)"})
  void testNewStringCharSource_whenFooTxt_thenReturnFileNameOrThrowIsFooTxt() {
    // Arrange and Act
    StringCharSource actualStringCharSource = new StringCharSource("42", "foo.txt");

    // Assert
    assertEquals("42", actualStringCharSource.readFirstLine());
    ImmutableList<String> readLinesResult = actualStringCharSource.readLines();
    assertEquals(1, readLinesResult.size());
    assertEquals("42", readLinesResult.get(0));
    assertEquals("foo.txt", actualStringCharSource.getFileNameOrThrow());
    Optional<String> fileName = actualStringCharSource.getFileName();
    assertEquals("foo.txt", fileName.get());
    assertEquals(2L, actualStringCharSource.length());
    assertFalse(actualStringCharSource.isEmpty());
    assertTrue(fileName.isPresent());
  }

  /**
   * Test {@link StringCharSource#StringCharSource(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return not FileName Present.
   * </ul>
   *
   * <p>Method under test: {@link StringCharSource#StringCharSource(String, String)}
   */
  @Test
  @DisplayName(
      "Test new StringCharSource(String, String); when 'null'; then return not FileName Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void StringCharSource.<init>(String, String)"})
  void testNewStringCharSource_whenNull_thenReturnNotFileNamePresent() {
    // Arrange and Act
    StringCharSource actualStringCharSource = new StringCharSource("42", null);

    // Assert
    assertEquals("42", actualStringCharSource.readFirstLine());
    ImmutableList<String> readLinesResult = actualStringCharSource.readLines();
    assertEquals(1, readLinesResult.size());
    assertEquals("42", readLinesResult.get(0));
    assertEquals(2L, actualStringCharSource.length());
    assertFalse(actualStringCharSource.isEmpty());
    assertFalse(actualStringCharSource.getFileName().isPresent());
  }

  /**
   * Test {@link StringCharSource#metaBean()}.
   *
   * <p>Method under test: {@link StringCharSource#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaBean StringCharSource.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    MetaBean actualMetaBeanResult = StringCharSource.EMPTY.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof Meta);
    assertTrue(actualMetaBeanResult.isBuildable());
  }

  /**
   * Test {@link StringCharSource#getFileName()}.
   *
   * <p>Method under test: {@link StringCharSource#getFileName()}
   */
  @Test
  @DisplayName("Test getFileName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional StringCharSource.getFileName()"})
  void testGetFileName() {
    // Arrange, Act and Assert
    assertFalse(StringCharSource.EMPTY.getFileName().isPresent());
  }

  /**
   * Test {@link StringCharSource#withFileName(String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return {@link StringCharSource#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link StringCharSource#withFileName(String)}
   */
  @Test
  @DisplayName("Test withFileName(String); when empty string; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StringCharSource StringCharSource.withFileName(String)"})
  void testWithFileName_whenEmptyString_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(StringCharSource.EMPTY, StringCharSource.EMPTY.withFileName(""));
  }

  /**
   * Test {@link StringCharSource#withFileName(String)}.
   *
   * <ul>
   *   <li>When {@code foo.txt}.
   *   <li>Then return FileNameOrThrow is {@code foo.txt}.
   * </ul>
   *
   * <p>Method under test: {@link StringCharSource#withFileName(String)}
   */
  @Test
  @DisplayName(
      "Test withFileName(String); when 'foo.txt'; then return FileNameOrThrow is 'foo.txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StringCharSource StringCharSource.withFileName(String)"})
  void testWithFileName_whenFooTxt_thenReturnFileNameOrThrowIsFooTxt() {
    // Arrange and Act
    StringCharSource actualWithFileNameResult = StringCharSource.EMPTY.withFileName("foo.txt");

    // Assert
    assertEquals("foo.txt", actualWithFileNameResult.getFileNameOrThrow());
    Optional<String> fileName = actualWithFileNameResult.getFileName();
    assertEquals("foo.txt", fileName.get());
    assertNull(actualWithFileNameResult.readFirstLine());
    assertEquals(0L, actualWithFileNameResult.length());
    assertTrue(actualWithFileNameResult.isEmpty());
    assertTrue(actualWithFileNameResult.readLines().isEmpty());
    assertTrue(fileName.isPresent());
  }

  /**
   * Test {@link StringCharSource#openStream()}.
   *
   * <p>Method under test: {@link StringCharSource#openStream()}
   */
  @Test
  @DisplayName("Test openStream()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Reader StringCharSource.openStream()"})
  void testOpenStream() throws IOException {
    // Arrange, Act and Assert
    assertTrue(StringCharSource.EMPTY.openStream().ready());
  }

  /**
   * Test {@link StringCharSource#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource#EMPTY}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link StringCharSource#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given EMPTY; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StringCharSource.isEmpty()"})
  void testIsEmpty_givenEmpty_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(StringCharSource.EMPTY.isEmpty());
  }

  /**
   * Test {@link StringCharSource#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with {@code Str}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link StringCharSource#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given StringCharSource with 'Str'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StringCharSource.isEmpty()"})
  void testIsEmpty_givenStringCharSourceWithStr_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(StringCharSource.of("Str").isEmpty());
  }

  /**
   * Test {@link StringCharSource#lengthIfKnown()}.
   *
   * <p>Method under test: {@link StringCharSource#lengthIfKnown()}
   */
  @Test
  @DisplayName("Test lengthIfKnown()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.base.Optional StringCharSource.lengthIfKnown()"})
  void testLengthIfKnown() {
    // Arrange, Act and Assert
    Optional<Long> toJavaUtilResult = StringCharSource.EMPTY.lengthIfKnown().toJavaUtil();
    assertEquals(0L, toJavaUtilResult.get().longValue());
    assertTrue(toJavaUtilResult.isPresent());
  }

  /**
   * Test {@link StringCharSource#length()}.
   *
   * <p>Method under test: {@link StringCharSource#length()}
   */
  @Test
  @DisplayName("Test length()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long StringCharSource.length()"})
  void testLength() {
    // Arrange, Act and Assert
    assertEquals(0L, StringCharSource.EMPTY.length());
  }

  /**
   * Test {@link StringCharSource#copyTo(Appendable)} with {@code appendable}.
   *
   * <ul>
   *   <li>When {@link CharArrayWriter#CharArrayWriter()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link StringCharSource#copyTo(Appendable)}
   */
  @Test
  @DisplayName(
      "Test copyTo(Appendable) with 'appendable'; when CharArrayWriter(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long StringCharSource.copyTo(Appendable)"})
  void testCopyToWithAppendable_whenCharArrayWriter_thenReturnZero() throws IOException {
    // Arrange, Act and Assert
    assertEquals(0L, StringCharSource.EMPTY.copyTo(new CharArrayWriter()));
  }

  /**
   * Test {@link StringCharSource#copyTo(CharSink)} with {@code sink}.
   *
   * <ul>
   *   <li>Given {@link IOException#IOException()}.
   *   <li>Then throw {@link IOException}.
   * </ul>
   *
   * <p>Method under test: {@link StringCharSource#copyTo(CharSink)}
   */
  @Test
  @DisplayName("Test copyTo(CharSink) with 'sink'; given IOException(); then throw IOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long StringCharSource.copyTo(CharSink)"})
  void testCopyToWithSink_givenIOException_thenThrowIOException() throws IOException {
    // Arrange
    CharSink sink = mock(CharSink.class);
    doThrow(new IOException()).when(sink).write(Mockito.<CharSequence>any());

    // Act and Assert
    assertThrows(IOException.class, () -> StringCharSource.EMPTY.copyTo(sink));
    verify(sink).write(isA(CharSequence.class));
  }

  /**
   * Test {@link StringCharSource#copyTo(CharSink)} with {@code sink}.
   *
   * <ul>
   *   <li>When {@link CharSink} {@link CharSink#write(CharSequence)} does nothing.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link StringCharSource#copyTo(CharSink)}
   */
  @Test
  @DisplayName(
      "Test copyTo(CharSink) with 'sink'; when CharSink write(CharSequence) does nothing; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long StringCharSource.copyTo(CharSink)"})
  void testCopyToWithSink_whenCharSinkWriteDoesNothing_thenReturnZero() throws IOException {
    // Arrange
    CharSink sink = mock(CharSink.class);
    doNothing().when(sink).write(Mockito.<CharSequence>any());

    // Act
    long actualCopyToResult = StringCharSource.EMPTY.copyTo(sink);

    // Assert
    verify(sink).write(isA(CharSequence.class));
    assertEquals(0L, actualCopyToResult);
  }

  /**
   * Test {@link StringCharSource#read()}.
   *
   * <p>Method under test: {@link StringCharSource#read()}
   */
  @Test
  @DisplayName("Test read()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String StringCharSource.read()"})
  void testRead() {
    // Arrange, Act and Assert
    assertEquals("", StringCharSource.EMPTY.read());
  }

  /**
   * Test {@link StringCharSource#load()}.
   *
   * <p>Method under test: {@link StringCharSource#load()}
   */
  @Test
  @DisplayName("Test load()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StringCharSource StringCharSource.load()"})
  void testLoad() {
    // Arrange, Act and Assert
    assertSame(StringCharSource.EMPTY, StringCharSource.EMPTY.load());
  }

  /**
   * Test {@link StringCharSource#asByteSourceUtf8()}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource#EMPTY}.
   *   <li>Then return {@link ArrayByteSource#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link StringCharSource#asByteSourceUtf8()}
   */
  @Test
  @DisplayName("Test asByteSourceUtf8(); given EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource StringCharSource.asByteSourceUtf8()"})
  void testAsByteSourceUtf8_givenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(ArrayByteSource.EMPTY, StringCharSource.EMPTY.asByteSourceUtf8());
  }

  /**
   * Test {@link StringCharSource#asByteSourceUtf8()}.
   *
   * <ul>
   *   <li>Then return readUtf8 is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link StringCharSource#asByteSourceUtf8()}
   */
  @Test
  @DisplayName("Test asByteSourceUtf8(); then return readUtf8 is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource StringCharSource.asByteSourceUtf8()"})
  void testAsByteSourceUtf8_thenReturnReadUtf8Is42() {
    // Arrange and Act
    ArrayByteSource actualAsByteSourceUtf8Result =
        new StringCharSource("42", "foo.txt").asByteSourceUtf8();

    // Assert
    assertEquals("42", actualAsByteSourceUtf8Result.readUtf8());
    assertEquals("42", actualAsByteSourceUtf8Result.readUtf8UsingBom());
    ArrayByteSource toMd5Result = actualAsByteSourceUtf8Result.toMd5();
    assertEquals("����?\u0002s'�F\u0010c��X�", toMd5Result.readUtf8());
    assertEquals("����?\u0002s'�F\u0010c��X�", toMd5Result.readUtf8UsingBom());
    assertEquals("foo.txt", actualAsByteSourceUtf8Result.getFileNameOrThrow());
    Optional<String> fileName = actualAsByteSourceUtf8Result.getFileName();
    assertEquals("foo.txt", fileName.get());
    assertEquals(2L, actualAsByteSourceUtf8Result.size());
    assertFalse(actualAsByteSourceUtf8Result.isEmpty());
    assertFalse(toMd5Result.getFileName().isPresent());
    assertTrue(fileName.isPresent());
    assertArrayEquals(new byte[] {'4', '2'}, actualAsByteSourceUtf8Result.readUnsafe());
    assertArrayEquals(
        new byte[] {-95, -48, -58, -24, '?', 2, 's', '\'', -40, 'F', 16, 'c', -12, -84, 'X', -90},
        toMd5Result.readUnsafe());
  }

  /**
   * Test {@link StringCharSource#asByteSource(Charset)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource#EMPTY}.
   *   <li>When forName {@code UTF-8}.
   *   <li>Then return {@link ArrayByteSource#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link StringCharSource#asByteSource(Charset)}
   */
  @Test
  @DisplayName("Test asByteSource(Charset); given EMPTY; when forName 'UTF-8'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource StringCharSource.asByteSource(Charset)"})
  void testAsByteSource_givenEmpty_whenForNameUtf8_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(
        ArrayByteSource.EMPTY, StringCharSource.EMPTY.asByteSource(Charset.forName("UTF-8")));
  }

  /**
   * Test {@link StringCharSource#asByteSource(Charset)}.
   *
   * <ul>
   *   <li>Then return readUtf8 is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link StringCharSource#asByteSource(Charset)}
   */
  @Test
  @DisplayName("Test asByteSource(Charset); then return readUtf8 is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource StringCharSource.asByteSource(Charset)"})
  void testAsByteSource_thenReturnReadUtf8Is42() {
    // Arrange
    StringCharSource stringCharSource = new StringCharSource("42", "foo.txt");

    // Act
    ArrayByteSource actualAsByteSourceResult =
        stringCharSource.asByteSource(Charset.forName("UTF-8"));

    // Assert
    assertEquals("42", actualAsByteSourceResult.readUtf8());
    assertEquals("42", actualAsByteSourceResult.readUtf8UsingBom());
    ArrayByteSource toMd5Result = actualAsByteSourceResult.toMd5();
    assertEquals("����?\u0002s'�F\u0010c��X�", toMd5Result.readUtf8());
    assertEquals("����?\u0002s'�F\u0010c��X�", toMd5Result.readUtf8UsingBom());
    assertEquals("foo.txt", actualAsByteSourceResult.getFileNameOrThrow());
    Optional<String> fileName = actualAsByteSourceResult.getFileName();
    assertEquals("foo.txt", fileName.get());
    assertEquals(2L, actualAsByteSourceResult.size());
    assertFalse(actualAsByteSourceResult.isEmpty());
    assertFalse(toMd5Result.getFileName().isPresent());
    assertTrue(fileName.isPresent());
    assertArrayEquals(new byte[] {'4', '2'}, actualAsByteSourceResult.readUnsafe());
    assertArrayEquals(
        new byte[] {-95, -48, -58, -24, '?', 2, 's', '\'', -40, 'F', 16, 'c', -12, -84, 'X', -90},
        toMd5Result.readUnsafe());
  }

  /**
   * Test {@link StringCharSource#equals(Object)}, and {@link StringCharSource#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link StringCharSource#equals(Object)}
   *   <li>{@link StringCharSource#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StringCharSource.equals(Object)", "int StringCharSource.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    StringCharSource stringCharSource = StringCharSource.EMPTY;
    StringCharSource stringCharSource2 = StringCharSource.EMPTY;

    // Act and Assert
    assertEquals(stringCharSource, stringCharSource2);
    assertEquals(stringCharSource.hashCode(), stringCharSource2.hashCode());
  }

  /**
   * Test {@link StringCharSource#equals(Object)}, and {@link StringCharSource#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link StringCharSource#equals(Object)}
   *   <li>{@link StringCharSource#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StringCharSource.equals(Object)", "int StringCharSource.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    StringCharSource ofResult = StringCharSource.of("Str");
    StringCharSource ofResult2 = StringCharSource.of("Str");

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link StringCharSource#equals(Object)}, and {@link StringCharSource#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link StringCharSource#equals(Object)}
   *   <li>{@link StringCharSource#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StringCharSource.equals(Object)", "int StringCharSource.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    StringCharSource stringCharSource = StringCharSource.EMPTY;

    // Act and Assert
    assertEquals(stringCharSource, stringCharSource);
    int expectedHashCodeResult = stringCharSource.hashCode();
    assertEquals(expectedHashCodeResult, stringCharSource.hashCode());
  }

  /**
   * Test {@link StringCharSource#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link StringCharSource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StringCharSource.equals(Object)", "int StringCharSource.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(StringCharSource.of("Str"), StringCharSource.EMPTY);
  }

  /**
   * Test {@link StringCharSource#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link StringCharSource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StringCharSource.equals(Object)", "int StringCharSource.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange, Act and Assert
    assertNotEquals(new StringCharSource("42", "foo.txt"), StringCharSource.EMPTY);
  }

  /**
   * Test {@link StringCharSource#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link StringCharSource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StringCharSource.equals(Object)", "int StringCharSource.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(StringCharSource.EMPTY, null);
  }

  /**
   * Test {@link StringCharSource#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link StringCharSource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StringCharSource.equals(Object)", "int StringCharSource.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(StringCharSource.EMPTY, "Different type to StringCharSource");
  }

  /**
   * Test {@link StringCharSource#toString()}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource#EMPTY}.
   *   <li>Then return {@code StringCharSource[0 chars]}.
   * </ul>
   *
   * <p>Method under test: {@link StringCharSource#toString()}
   */
  @Test
  @DisplayName("Test toString(); given EMPTY; then return 'StringCharSource[0 chars]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String StringCharSource.toString()"})
  void testToString_givenEmpty_thenReturnStringCharSource0Chars() {
    // Arrange, Act and Assert
    assertEquals("StringCharSource[0 chars]", StringCharSource.EMPTY.toString());
  }

  /**
   * Test {@link StringCharSource#toString()}.
   *
   * <ul>
   *   <li>Then return {@code StringCharSource[2 chars, foo.txt]}.
   * </ul>
   *
   * <p>Method under test: {@link StringCharSource#toString()}
   */
  @Test
  @DisplayName("Test toString(); then return 'StringCharSource[2 chars, foo.txt]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String StringCharSource.toString()"})
  void testToString_thenReturnStringCharSource2CharsFooTxt() {
    // Arrange, Act and Assert
    assertEquals(
        "StringCharSource[2 chars, foo.txt]", new StringCharSource("42", "foo.txt").toString());
  }
}
