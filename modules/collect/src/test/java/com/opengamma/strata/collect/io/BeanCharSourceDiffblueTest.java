package com.opengamma.strata.collect.io;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.google.common.io.LineProcessor;
import com.opengamma.strata.collect.io.UnicodeBom.UnicodeBomCharSource;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class BeanCharSourceDiffblueTest {
  /**
   * Test {@link BeanCharSource#getFileNameOrThrow()}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource#EMPTY}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link BeanCharSource#getFileNameOrThrow()}
   */
  @Test
  @DisplayName("Test getFileNameOrThrow(); given EMPTY; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BeanCharSource.getFileNameOrThrow()"})
  void testGetFileNameOrThrow_givenEmpty_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> StringCharSource.EMPTY.getFileNameOrThrow());
  }

  /**
   * Test {@link BeanCharSource#getFileNameOrThrow()}.
   *
   * <ul>
   *   <li>Then return {@code foo.txt}.
   * </ul>
   *
   * <p>Method under test: {@link BeanCharSource#getFileNameOrThrow()}
   */
  @Test
  @DisplayName("Test getFileNameOrThrow(); then return 'foo.txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BeanCharSource.getFileNameOrThrow()"})
  void testGetFileNameOrThrow_thenReturnFooTxt() {
    // Arrange, Act and Assert
    assertEquals("foo.txt", new StringCharSource("42", "foo.txt").getFileNameOrThrow());
  }

  /**
   * Test {@link BeanCharSource#lines()}.
   *
   * <p>Method under test: {@link BeanCharSource#lines()}
   */
  @Test
  @DisplayName("Test lines()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream BeanCharSource.lines()"})
  void testLines() {
    // Arrange and Act
    Stream<String> actualLinesResult = StringCharSource.EMPTY.lines();

    // Assert
    assertTrue(actualLinesResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link BeanCharSource#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link UnicodeBomCharSource#UnicodeBomCharSource(BeanByteSource)} with underlying
   *       is {@link ArrayByteSource#EMPTY}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link BeanCharSource#isEmpty()}
   */
  @Test
  @DisplayName(
      "Test isEmpty(); given UnicodeBomCharSource(BeanByteSource) with underlying is EMPTY; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BeanCharSource.isEmpty()"})
  void testIsEmpty_givenUnicodeBomCharSourceWithUnderlyingIsEmpty_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(new UnicodeBomCharSource(ArrayByteSource.EMPTY).isEmpty());
  }

  /**
   * Test {@link BeanCharSource#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link UnicodeBomCharSource#UnicodeBomCharSource(BeanByteSource)} with underlying
   *       is fromBase64 {@code Base64}.
   * </ul>
   *
   * <p>Method under test: {@link BeanCharSource#isEmpty()}
   */
  @Test
  @DisplayName(
      "Test isEmpty(); given UnicodeBomCharSource(BeanByteSource) with underlying is fromBase64 'Base64'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BeanCharSource.isEmpty()"})
  void testIsEmpty_givenUnicodeBomCharSourceWithUnderlyingIsFromBase64Base64() {
    // Arrange, Act and Assert
    assertFalse(new UnicodeBomCharSource(ArrayByteSource.fromBase64("Base64")).isEmpty());
  }

  /**
   * Test {@link BeanCharSource#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link UriByteSource} with uri is Property is {@code java.io.tmpdir} is empty
   *       string toUri.
   * </ul>
   *
   * <p>Method under test: {@link BeanCharSource#isEmpty()}
   */
  @Test
  @DisplayName(
      "Test isEmpty(); given UriByteSource with uri is Property is 'java.io.tmpdir' is empty string toUri")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BeanCharSource.isEmpty()"})
  void testIsEmpty_givenUriByteSourceWithUriIsPropertyIsJavaIoTmpdirIsEmptyStringToUri() {
    // Arrange
    UriByteSource underlying =
        UriByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "").toUri());

    // Act and Assert
    assertFalse(new UnicodeBomCharSource(underlying).isEmpty());
  }

  /**
   * Test {@link BeanCharSource#isEmpty()}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link BeanCharSource#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BeanCharSource.isEmpty()"})
  void testIsEmpty_thenThrowUncheckedIOException() {
    // Arrange
    FileByteSource underlying =
        FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> new UnicodeBomCharSource(underlying).isEmpty());
  }

  /**
   * Test {@link BeanCharSource#length()}.
   *
   * <ul>
   *   <li>Given {@link UnicodeBomCharSource#UnicodeBomCharSource(BeanByteSource)} with underlying
   *       is {@link ArrayByteSource#EMPTY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BeanCharSource#length()}
   */
  @Test
  @DisplayName(
      "Test length(); given UnicodeBomCharSource(BeanByteSource) with underlying is EMPTY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long BeanCharSource.length()"})
  void testLength_givenUnicodeBomCharSourceWithUnderlyingIsEmpty_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0L, new UnicodeBomCharSource(ArrayByteSource.EMPTY).length());
  }

  /**
   * Test {@link BeanCharSource#length()}.
   *
   * <ul>
   *   <li>Then return four.
   * </ul>
   *
   * <p>Method under test: {@link BeanCharSource#length()}
   */
  @Test
  @DisplayName("Test length(); then return four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long BeanCharSource.length()"})
  void testLength_thenReturnFour() {
    // Arrange, Act and Assert
    assertEquals(4L, new UnicodeBomCharSource(ArrayByteSource.fromBase64("Base64")).length());
  }

  /**
   * Test {@link BeanCharSource#length()}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link BeanCharSource#length()}
   */
  @Test
  @DisplayName("Test length(); then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long BeanCharSource.length()"})
  void testLength_thenThrowUncheckedIOException() {
    // Arrange
    FileByteSource underlying =
        FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> new UnicodeBomCharSource(underlying).length());
  }

  /**
   * Test {@link BeanCharSource#read()}.
   *
   * <p>Method under test: {@link BeanCharSource#read()}
   */
  @Test
  @DisplayName("Test read()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BeanCharSource.read()"})
  void testRead() {
    // Arrange, Act and Assert
    assertEquals(
        "\u0005�\u001e�", new UnicodeBomCharSource(ArrayByteSource.fromBase64("Base64")).read());
  }

  /**
   * Test {@link BeanCharSource#read()}.
   *
   * <ul>
   *   <li>Given {@link UnicodeBomCharSource#UnicodeBomCharSource(BeanByteSource)} with underlying
   *       is {@link ArrayByteSource#EMPTY}.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link BeanCharSource#read()}
   */
  @Test
  @DisplayName(
      "Test read(); given UnicodeBomCharSource(BeanByteSource) with underlying is EMPTY; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BeanCharSource.read()"})
  void testRead_givenUnicodeBomCharSourceWithUnderlyingIsEmpty_thenReturnEmptyString() {
    // Arrange, Act and Assert
    assertEquals("", new UnicodeBomCharSource(ArrayByteSource.EMPTY).read());
  }

  /**
   * Test {@link BeanCharSource#read()}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link BeanCharSource#read()}
   */
  @Test
  @DisplayName("Test read(); then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BeanCharSource.read()"})
  void testRead_thenThrowUncheckedIOException() {
    // Arrange
    FileByteSource underlying =
        FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> new UnicodeBomCharSource(underlying).read());
  }

  /**
   * Test {@link BeanCharSource#readFirstLine()}.
   *
   * <p>Method under test: {@link BeanCharSource#readFirstLine()}
   */
  @Test
  @DisplayName("Test readFirstLine()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BeanCharSource.readFirstLine()"})
  void testReadFirstLine() {
    // Arrange, Act and Assert
    assertNull(StringCharSource.EMPTY.readFirstLine());
  }

  /**
   * Test {@link BeanCharSource#readLines(LineProcessor)} with {@code LineProcessor}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource#EMPTY}.
   *   <li>Then return {@code Result}.
   * </ul>
   *
   * <p>Method under test: {@link BeanCharSource#readLines(LineProcessor)}
   */
  @Test
  @DisplayName(
      "Test readLines(LineProcessor) with 'LineProcessor'; given EMPTY; then return 'Result'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object BeanCharSource.readLines(LineProcessor)"})
  void testReadLinesWithLineProcessor_givenEmpty_thenReturnResult() {
    // Arrange
    LineProcessor<Object> processor = mock(LineProcessor.class);
    when(processor.getResult()).thenReturn("Result");

    // Act
    Object actualReadLinesResult = StringCharSource.EMPTY.readLines(processor);

    // Assert
    verify(processor).getResult();
    assertEquals("Result", actualReadLinesResult);
  }

  /**
   * Test {@link BeanCharSource#readLines(LineProcessor)} with {@code LineProcessor}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link BeanCharSource#readLines(LineProcessor)}
   */
  @Test
  @DisplayName("Test readLines(LineProcessor) with 'LineProcessor'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object BeanCharSource.readLines(LineProcessor)"})
  void testReadLinesWithLineProcessor_givenFalse() throws IOException {
    // Arrange
    StringCharSource ofResult = StringCharSource.of("Str");

    LineProcessor<Object> processor = mock(LineProcessor.class);
    when(processor.processLine(Mockito.<String>any())).thenReturn(false);
    when(processor.getResult()).thenReturn("Result");

    // Act
    Object actualReadLinesResult = ofResult.readLines(processor);

    // Assert
    verify(processor).getResult();
    verify(processor).processLine("Str");
    assertEquals("Result", actualReadLinesResult);
  }

  /**
   * Test {@link BeanCharSource#readLines(LineProcessor)} with {@code LineProcessor}.
   *
   * <ul>
   *   <li>Given {@link IOException#IOException()}.
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link BeanCharSource#readLines(LineProcessor)}
   */
  @Test
  @DisplayName(
      "Test readLines(LineProcessor) with 'LineProcessor'; given IOException(); then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object BeanCharSource.readLines(LineProcessor)"})
  void testReadLinesWithLineProcessor_givenIOException_thenThrowUncheckedIOException()
      throws IOException {
    // Arrange
    StringCharSource ofResult = StringCharSource.of("Str");

    LineProcessor<Object> processor = mock(LineProcessor.class);
    when(processor.processLine(Mockito.<String>any())).thenThrow(new IOException());

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> ofResult.readLines(processor));
    verify(processor).processLine("Str");
  }

  /**
   * Test {@link BeanCharSource#readLines(LineProcessor)} with {@code LineProcessor}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link LineProcessor} {@link LineProcessor#processLine(String)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link BeanCharSource#readLines(LineProcessor)}
   */
  @Test
  @DisplayName(
      "Test readLines(LineProcessor) with 'LineProcessor'; given 'true'; when LineProcessor processLine(String) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object BeanCharSource.readLines(LineProcessor)"})
  void testReadLinesWithLineProcessor_givenTrue_whenLineProcessorProcessLineReturnTrue()
      throws IOException {
    // Arrange
    StringCharSource ofResult = StringCharSource.of("Str");

    LineProcessor<Object> processor = mock(LineProcessor.class);
    when(processor.processLine(Mockito.<String>any())).thenReturn(true);
    when(processor.getResult()).thenReturn("Result");

    // Act
    Object actualReadLinesResult = ofResult.readLines(processor);

    // Assert
    verify(processor).getResult();
    verify(processor).processLine("Str");
    assertEquals("Result", actualReadLinesResult);
  }

  /**
   * Test {@link BeanCharSource#readLines()}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource#EMPTY}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link BeanCharSource#readLines()}
   */
  @Test
  @DisplayName("Test readLines(); given EMPTY; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList BeanCharSource.readLines()"})
  void testReadLines_givenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertTrue(StringCharSource.EMPTY.readLines().isEmpty());
  }

  /**
   * Test {@link BeanCharSource#readLines()}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with {@code Str}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link BeanCharSource#readLines()}
   */
  @Test
  @DisplayName("Test readLines(); given StringCharSource with 'Str'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList BeanCharSource.readLines()"})
  void testReadLines_givenStringCharSourceWithStr_thenReturnSizeIsOne() {
    // Arrange and Act
    ImmutableList<String> actualReadLinesResult = StringCharSource.of("Str").readLines();

    // Assert
    assertEquals(1, actualReadLinesResult.size());
    assertEquals("Str", actualReadLinesResult.get(0));
  }

  /**
   * Test {@link BeanCharSource#forEachLine(Consumer)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource#EMPTY}.
   *   <li>When {@link Consumer}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link BeanCharSource#forEachLine(Consumer)}
   */
  @Test
  @DisplayName("Test forEachLine(Consumer); given EMPTY; when Consumer; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BeanCharSource.forEachLine(Consumer)"})
  void testForEachLine_givenEmpty_whenConsumer_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> StringCharSource.EMPTY.forEachLine(mock(Consumer.class)));
  }

  /**
   * Test {@link BeanCharSource#forEachLine(Consumer)}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link BeanCharSource#forEachLine(Consumer)}
   */
  @Test
  @DisplayName("Test forEachLine(Consumer); then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BeanCharSource.forEachLine(Consumer)"})
  void testForEachLine_thenThrowUncheckedIOException() {
    // Arrange
    StringCharSource ofResult = StringCharSource.of("Str");

    Consumer<String> action = mock(Consumer.class);
    doThrow(new UncheckedIOException(new IOException())).when(action).accept(Mockito.<String>any());

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> ofResult.forEachLine(action));
    verify(action).accept("Str");
  }

  /**
   * Test {@link BeanCharSource#load()}.
   *
   * <p>Method under test: {@link BeanCharSource#load()}
   */
  @Test
  @DisplayName("Test load()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StringCharSource BeanCharSource.load()"})
  void testLoad() {
    // Arrange and Act
    StringCharSource actualLoadResult =
        new UnicodeBomCharSource(ArrayByteSource.fromBase64("Base64")).load();

    // Assert
    assertEquals("\u0005�\u001e�", actualLoadResult.readFirstLine());
    ImmutableList<String> readLinesResult = actualLoadResult.readLines();
    assertEquals(1, readLinesResult.size());
    assertEquals("\u0005�\u001e�", readLinesResult.get(0));
    assertEquals(4L, actualLoadResult.length());
    assertFalse(actualLoadResult.isEmpty());
  }

  /**
   * Test {@link BeanCharSource#load()}.
   *
   * <ul>
   *   <li>Given {@link UnicodeBomCharSource#UnicodeBomCharSource(BeanByteSource)} with underlying
   *       is {@link ArrayByteSource#EMPTY}.
   *   <li>Then return {@link StringCharSource#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link BeanCharSource#load()}
   */
  @Test
  @DisplayName(
      "Test load(); given UnicodeBomCharSource(BeanByteSource) with underlying is EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StringCharSource BeanCharSource.load()"})
  void testLoad_givenUnicodeBomCharSourceWithUnderlyingIsEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(StringCharSource.EMPTY, new UnicodeBomCharSource(ArrayByteSource.EMPTY).load());
  }

  /**
   * Test {@link BeanCharSource#load()}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link BeanCharSource#load()}
   */
  @Test
  @DisplayName("Test load(); then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StringCharSource BeanCharSource.load()"})
  void testLoad_thenThrowUncheckedIOException() {
    // Arrange
    FileByteSource underlying =
        FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> new UnicodeBomCharSource(underlying).load());
  }

  /**
   * Test {@link BeanCharSource#asByteSourceUtf8()}.
   *
   * <ul>
   *   <li>Given {@link UnicodeBomCharSource#UnicodeBomCharSource(BeanByteSource)} with underlying
   *       is {@link ArrayByteSource#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link BeanCharSource#asByteSourceUtf8()}
   */
  @Test
  @DisplayName(
      "Test asByteSourceUtf8(); given UnicodeBomCharSource(BeanByteSource) with underlying is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BeanByteSource BeanCharSource.asByteSourceUtf8()"})
  void testAsByteSourceUtf8_givenUnicodeBomCharSourceWithUnderlyingIsEmpty() {
    // Arrange and Act
    BeanByteSource actualAsByteSourceUtf8Result =
        new UnicodeBomCharSource(ArrayByteSource.EMPTY).asByteSourceUtf8();

    // Assert
    assertTrue(actualAsByteSourceUtf8Result instanceof ArrayByteSource);
    assertEquals(
        ((ArrayByteSource) actualAsByteSourceUtf8Result).EMPTY, actualAsByteSourceUtf8Result);
  }

  /**
   * Test {@link BeanCharSource#asByteSourceUtf8()}.
   *
   * <ul>
   *   <li>Then return toMd5 readUtf8 is a string.
   * </ul>
   *
   * <p>Method under test: {@link BeanCharSource#asByteSourceUtf8()}
   */
  @Test
  @DisplayName("Test asByteSourceUtf8(); then return toMd5 readUtf8 is a string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BeanByteSource BeanCharSource.asByteSourceUtf8()"})
  void testAsByteSourceUtf8_thenReturnToMd5ReadUtf8IsAString() {
    // Arrange and Act
    BeanByteSource actualAsByteSourceUtf8Result =
        new UnicodeBomCharSource(ArrayByteSource.fromHex("0123456789ABCDEF")).asByteSourceUtf8();

    // Assert
    assertTrue(actualAsByteSourceUtf8Result instanceof ArrayByteSource);
    ArrayByteSource toMd5Result = ((ArrayByteSource) actualAsByteSourceUtf8Result).toMd5();
    assertEquals("&1u�\u0015�!��U�m{c��", toMd5Result.readUtf8());
    assertEquals("&1u�\u0015�!��U�m{c��", toMd5Result.readUtf8UsingBom());
    assertEquals("\u0001#Eg����", actualAsByteSourceUtf8Result.readUtf8());
    assertEquals("\u0001#Eg����", actualAsByteSourceUtf8Result.readUtf8UsingBom());
    ArrayByteSource toMd5Result2 = toMd5Result.toMd5();
    assertEquals("�5̢J/�\u0018�`=Q�@�1", toMd5Result2.readUtf8());
    assertEquals("�5̢J/�\u0018�`=Q�@�1", toMd5Result2.readUtf8UsingBom());
    assertEquals(16L, actualAsByteSourceUtf8Result.size());
    assertArrayEquals(
        new byte[] {-123, '5', -52, -94, 'J', '/', -47, 24, -49, '`', '=', 'Q', -55, '@', -76, '1'},
        toMd5Result2.readUnsafe());
    assertArrayEquals(
        new byte[] {1, '#', 'E', 'g', -17, -65, -67, -17, -65, -67, -17, -65, -67, -17, -65, -67},
        ((ArrayByteSource) actualAsByteSourceUtf8Result).readUnsafe());
    assertArrayEquals(
        new byte[] {
          '&', '1', 'u', -112, 21, -27, '!', -34, -50, 'U', -101, 'm', '{', 'c', -63, -67
        },
        toMd5Result.readUnsafe());
  }

  /**
   * Test {@link BeanCharSource#asByteSource(Charset)}.
   *
   * <ul>
   *   <li>Given {@link UnicodeBomCharSource#UnicodeBomCharSource(BeanByteSource)} with underlying
   *       is {@link ArrayByteSource#EMPTY}.
   *   <li>Then return {@link ArrayByteSource#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link BeanCharSource#asByteSource(Charset)}
   */
  @Test
  @DisplayName(
      "Test asByteSource(Charset); given UnicodeBomCharSource(BeanByteSource) with underlying is EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BeanByteSource BeanCharSource.asByteSource(Charset)"})
  void testAsByteSource_givenUnicodeBomCharSourceWithUnderlyingIsEmpty_thenReturnEmpty() {
    // Arrange
    UnicodeBomCharSource unicodeBomCharSource = new UnicodeBomCharSource(ArrayByteSource.EMPTY);

    // Act
    BeanByteSource actualAsByteSourceResult =
        unicodeBomCharSource.asByteSource(Charset.forName("UTF-8"));

    // Assert
    assertTrue(actualAsByteSourceResult instanceof ArrayByteSource);
    assertEquals(((ArrayByteSource) actualAsByteSourceResult).EMPTY, actualAsByteSourceResult);
  }

  /**
   * Test {@link BeanCharSource#asByteSource(Charset)}.
   *
   * <ul>
   *   <li>Then return toMd5 readUtf8 is a string.
   * </ul>
   *
   * <p>Method under test: {@link BeanCharSource#asByteSource(Charset)}
   */
  @Test
  @DisplayName("Test asByteSource(Charset); then return toMd5 readUtf8 is a string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BeanByteSource BeanCharSource.asByteSource(Charset)"})
  void testAsByteSource_thenReturnToMd5ReadUtf8IsAString() {
    // Arrange
    UnicodeBomCharSource unicodeBomCharSource =
        new UnicodeBomCharSource(ArrayByteSource.fromHex("0123456789ABCDEF"));

    // Act
    BeanByteSource actualAsByteSourceResult =
        unicodeBomCharSource.asByteSource(Charset.forName("UTF-8"));

    // Assert
    assertTrue(actualAsByteSourceResult instanceof ArrayByteSource);
    ArrayByteSource toMd5Result = ((ArrayByteSource) actualAsByteSourceResult).toMd5();
    assertEquals("&1u�\u0015�!��U�m{c��", toMd5Result.readUtf8());
    assertEquals("&1u�\u0015�!��U�m{c��", toMd5Result.readUtf8UsingBom());
    assertEquals("\u0001#Eg����", actualAsByteSourceResult.readUtf8());
    assertEquals("\u0001#Eg����", actualAsByteSourceResult.readUtf8UsingBom());
    assertEquals(16L, actualAsByteSourceResult.size());
    assertFalse(actualAsByteSourceResult.isEmpty());
    assertArrayEquals(
        new byte[] {1, '#', 'E', 'g', -17, -65, -67, -17, -65, -67, -17, -65, -67, -17, -65, -67},
        ((ArrayByteSource) actualAsByteSourceResult).readUnsafe());
    assertArrayEquals(
        new byte[] {
          '&', '1', 'u', -112, 21, -27, '!', -34, -50, 'U', -101, 'm', '{', 'c', -63, -67
        },
        toMd5Result.readUnsafe());
  }
}
