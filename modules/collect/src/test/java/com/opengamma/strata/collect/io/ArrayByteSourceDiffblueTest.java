package com.opengamma.strata.collect.io;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.io.ByteProcessor;
import com.google.common.io.ByteSource;
import com.opengamma.strata.collect.function.CheckedConsumer;
import com.opengamma.strata.collect.function.CheckedSupplier;
import com.opengamma.strata.collect.io.ArrayByteSource.Meta;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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

class ArrayByteSourceDiffblueTest {
  /**
   * Test {@link ArrayByteSource#copyOf(byte[])} with {@code array}.
   *
   * <p>Method under test: {@link ArrayByteSource#copyOf(byte[])}
   */
  @Test
  @DisplayName("Test copyOf(byte[]) with 'array'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ArrayByteSource.copyOf(byte[])"})
  void testCopyOfWithArray() throws UnsupportedEncodingException {
    // Arrange and Act
    ArrayByteSource actualCopyOfResult = ArrayByteSource.copyOf("AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals("AXAXAXAX", actualCopyOfResult.readUtf8());
    assertEquals("AXAXAXAX", actualCopyOfResult.readUtf8UsingBom());
    ArrayByteSource toMd5Result = actualCopyOfResult.toMd5();
    assertEquals("�\u001f�'?M\u0012��2bԿH��", toMd5Result.readUtf8());
    assertEquals("�\u001f�'?M\u0012��2bԿH��", toMd5Result.readUtf8UsingBom());
    assertEquals(16L, toMd5Result.size());
    assertEquals(8L, actualCopyOfResult.size());
    assertFalse(toMd5Result.isEmpty());
    assertFalse(actualCopyOfResult.isEmpty());
    Optional<String> fileName = actualCopyOfResult.getFileName();
    assertFalse(fileName.isPresent());
    assertSame(fileName, toMd5Result.getFileName());
    byte[] expectedReadUnsafeResult = "AXAXAXAX".getBytes("UTF-8");
    assertArrayEquals(expectedReadUnsafeResult, actualCopyOfResult.readUnsafe());
    assertArrayEquals(
        new byte[] {-94, 31, -88, '\'', '?', 'M', 18, -56, -60, '2', 'b', -44, -65, 'H', -73, -50},
        toMd5Result.readUnsafe());
  }

  /**
   * Test {@link ArrayByteSource#copyOf(byte[], int, int)} with {@code array}, {@code
   * fromIndexInclusive}, {@code toIndexExclusive}.
   *
   * <p>Method under test: {@link ArrayByteSource#copyOf(byte[], int, int)}
   */
  @Test
  @DisplayName(
      "Test copyOf(byte[], int, int) with 'array', 'fromIndexInclusive', 'toIndexExclusive'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ArrayByteSource.copyOf(byte[], int, int)"})
  void testCopyOfWithArrayFromIndexInclusiveToIndexExclusive() throws UnsupportedEncodingException {
    // Arrange and Act
    ArrayByteSource actualCopyOfResult = ArrayByteSource.copyOf("AXAXAXAX".getBytes("UTF-8"), 1, 1);

    // Assert
    assertEquals("", actualCopyOfResult.readUtf8());
    assertEquals("", actualCopyOfResult.readUtf8UsingBom());
    ArrayByteSource toMd5Result = actualCopyOfResult.toMd5();
    ArrayByteSource toMd5Result2 = toMd5Result.toMd5();
    assertEquals("Y��N�;\u0002��[9X'E?", toMd5Result2.readUtf8());
    assertEquals("Y��N�;\u0002��[9X'E?", toMd5Result2.readUtf8UsingBom());
    assertEquals("�\u001d�ُ\u0000�\u0004�\t���B~", toMd5Result.readUtf8());
    assertEquals("�\u001d�ُ\u0000�\u0004�\t���B~", toMd5Result.readUtf8UsingBom());
    assertEquals(0L, actualCopyOfResult.size());
    assertTrue(actualCopyOfResult.isEmpty());
    assertArrayEquals(new byte[] {}, actualCopyOfResult.readUnsafe());
    assertArrayEquals(
        new byte[] {
          -44, 29, -116, -39, -113, 0, -78, 4, -23, Byte.MIN_VALUE, '\t', -104, -20, -8, 'B', '~'
        },
        toMd5Result.readUnsafe());
    assertArrayEquals(
        new byte[] {'Y', -83, -78, 'N', -13, -51, -66, 2, -105, -16, '[', '9', 'X', '\'', 'E', '?'},
        toMd5Result2.readUnsafe());
  }

  /**
   * Test {@link ArrayByteSource#copyOf(byte[], int, int)} with {@code array}, {@code
   * fromIndexInclusive}, {@code toIndexExclusive}.
   *
   * <ul>
   *   <li>Then return readUtf8 is {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#copyOf(byte[], int, int)}
   */
  @Test
  @DisplayName(
      "Test copyOf(byte[], int, int) with 'array', 'fromIndexInclusive', 'toIndexExclusive'; then return readUtf8 is 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ArrayByteSource.copyOf(byte[], int, int)"})
  void testCopyOfWithArrayFromIndexInclusiveToIndexExclusive_thenReturnReadUtf8IsA()
      throws UnsupportedEncodingException {
    // Arrange and Act
    ArrayByteSource actualCopyOfResult = ArrayByteSource.copyOf("AXAXAXAX".getBytes("UTF-8"), 0, 1);

    // Assert
    assertEquals("A", actualCopyOfResult.readUtf8());
    assertEquals("A", actualCopyOfResult.readUtf8UsingBom());
    ArrayByteSource toMd5Result = actualCopyOfResult.toMd5();
    ArrayByteSource toMd5Result2 = toMd5Result.toMd5();
    assertEquals("�(��#\u0018`\u0011]*���\u0001��", toMd5Result2.readUtf8());
    assertEquals("�(��#\u0018`\u0011]*���\u0001��", toMd5Result2.readUtf8UsingBom());
    assertEquals("�bp�\u000f�\u001aY5�.��)", toMd5Result.readUtf8());
    assertEquals("�bp�\u000f�\u001aY5�.��)", toMd5Result.readUtf8UsingBom());
    assertEquals(1L, actualCopyOfResult.size());
    assertFalse(actualCopyOfResult.isEmpty());
    assertArrayEquals(new byte[] {'A'}, actualCopyOfResult.readUnsafe());
    assertArrayEquals(
        new byte[] {-113, '(', -14, -25, '#', 24, '`', 17, ']', '*', -116, -84, -70, 1, -99, -66},
        toMd5Result2.readUnsafe());
    assertArrayEquals(
        new byte[] {
          Byte.MAX_VALUE, -59, 'b', 'p', -25, -89, 15, -88, 26, 'Y', '5', -73, '.', -84, -66, ')'
        },
        toMd5Result.readUnsafe());
  }

  /**
   * Test {@link ArrayByteSource#copyOf(byte[], int)} with {@code array}, {@code fromIndex}.
   *
   * <ul>
   *   <li>When eight.
   *   <li>Then return readUtf8 is empty string.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#copyOf(byte[], int)}
   */
  @Test
  @DisplayName(
      "Test copyOf(byte[], int) with 'array', 'fromIndex'; when eight; then return readUtf8 is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ArrayByteSource.copyOf(byte[], int)"})
  void testCopyOfWithArrayFromIndex_whenEight_thenReturnReadUtf8IsEmptyString()
      throws UnsupportedEncodingException {
    // Arrange and Act
    ArrayByteSource actualCopyOfResult = ArrayByteSource.copyOf("AXAXAXAX".getBytes("UTF-8"), 8);

    // Assert
    assertEquals("", actualCopyOfResult.readUtf8());
    assertEquals("", actualCopyOfResult.readUtf8UsingBom());
    ArrayByteSource toMd5Result = actualCopyOfResult.toMd5();
    ArrayByteSource toMd5Result2 = toMd5Result.toMd5();
    assertEquals("Y��N�;\u0002��[9X'E?", toMd5Result2.readUtf8());
    assertEquals("Y��N�;\u0002��[9X'E?", toMd5Result2.readUtf8UsingBom());
    assertEquals("�\u001d�ُ\u0000�\u0004�\t���B~", toMd5Result.readUtf8());
    assertEquals("�\u001d�ُ\u0000�\u0004�\t���B~", toMd5Result.readUtf8UsingBom());
    assertEquals(0L, actualCopyOfResult.size());
    assertTrue(actualCopyOfResult.isEmpty());
    assertArrayEquals(new byte[] {}, actualCopyOfResult.readUnsafe());
    assertArrayEquals(
        new byte[] {
          -44, 29, -116, -39, -113, 0, -78, 4, -23, Byte.MIN_VALUE, '\t', -104, -20, -8, 'B', '~'
        },
        toMd5Result.readUnsafe());
    assertArrayEquals(
        new byte[] {'Y', -83, -78, 'N', -13, -51, -66, 2, -105, -16, '[', '9', 'X', '\'', 'E', '?'},
        toMd5Result2.readUnsafe());
  }

  /**
   * Test {@link ArrayByteSource#copyOf(byte[], int)} with {@code array}, {@code fromIndex}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return readUtf8 is {@code XAXAXAX}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#copyOf(byte[], int)}
   */
  @Test
  @DisplayName(
      "Test copyOf(byte[], int) with 'array', 'fromIndex'; when one; then return readUtf8 is 'XAXAXAX'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ArrayByteSource.copyOf(byte[], int)"})
  void testCopyOfWithArrayFromIndex_whenOne_thenReturnReadUtf8IsXaxaxax()
      throws UnsupportedEncodingException {
    // Arrange and Act
    ArrayByteSource actualCopyOfResult = ArrayByteSource.copyOf("AXAXAXAX".getBytes("UTF-8"), 1);

    // Assert
    assertEquals("XAXAXAX", actualCopyOfResult.readUtf8());
    assertEquals("XAXAXAX", actualCopyOfResult.readUtf8UsingBom());
    ArrayByteSource toMd5Result = actualCopyOfResult.toMd5();
    assertEquals("\u0001�f�\u0014+��hӾ����", toMd5Result.readUtf8());
    assertEquals("\u0001�f�\u0014+��hӾ����", toMd5Result.readUtf8UsingBom());
    ArrayByteSource toMd5Result2 = toMd5Result.toMd5();
    assertEquals("�Q�s��!��^u�N\u0006X", toMd5Result2.readUtf8());
    assertEquals("�Q�s��!��^u�N\u0006X", toMd5Result2.readUtf8UsingBom());
    assertEquals(7L, actualCopyOfResult.size());
    assertFalse(actualCopyOfResult.isEmpty());
    byte[] expectedReadUnsafeResult = "XAXAXAX".getBytes("UTF-8");
    assertArrayEquals(expectedReadUnsafeResult, actualCopyOfResult.readUnsafe());
    assertArrayEquals(
        new byte[] {-44, 'Q', -8, 's', -9, -77, '!', -126, -113, '^', 'u', -16, -90, 'N', 6, 'X'},
        toMd5Result2.readUnsafe());
    assertArrayEquals(
        new byte[] {1, -14, 'f', -67, 20, '+', -15, -123, -47, 'h', -45, -66, -119, -110, -49, -40},
        toMd5Result.readUnsafe());
  }

  /**
   * Test {@link ArrayByteSource#ofUnsafe(byte[])}.
   *
   * <p>Method under test: {@link ArrayByteSource#ofUnsafe(byte[])}
   */
  @Test
  @DisplayName("Test ofUnsafe(byte[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ArrayByteSource.ofUnsafe(byte[])"})
  void testOfUnsafe() throws UnsupportedEncodingException {
    // Arrange and Act
    ArrayByteSource actualOfUnsafeResult = ArrayByteSource.ofUnsafe("AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals("AXAXAXAX", actualOfUnsafeResult.readUtf8());
    assertEquals("AXAXAXAX", actualOfUnsafeResult.readUtf8UsingBom());
    ArrayByteSource toMd5Result = actualOfUnsafeResult.toMd5();
    assertEquals("�\u001f�'?M\u0012��2bԿH��", toMd5Result.readUtf8());
    assertEquals("�\u001f�'?M\u0012��2bԿH��", toMd5Result.readUtf8UsingBom());
    assertEquals(16L, toMd5Result.size());
    assertEquals(8L, actualOfUnsafeResult.size());
    assertFalse(toMd5Result.isEmpty());
    assertFalse(actualOfUnsafeResult.isEmpty());
    Optional<String> fileName = actualOfUnsafeResult.getFileName();
    assertFalse(fileName.isPresent());
    assertSame(fileName, toMd5Result.getFileName());
    byte[] expectedReadUnsafeResult = "AXAXAXAX".getBytes("UTF-8");
    assertArrayEquals(expectedReadUnsafeResult, actualOfUnsafeResult.readUnsafe());
    assertArrayEquals(
        new byte[] {-94, 31, -88, '\'', '?', 'M', 18, -56, -60, '2', 'b', -44, -65, 'H', -73, -50},
        toMd5Result.readUnsafe());
  }

  /**
   * Test {@link ArrayByteSource#ofUtf8(String)}.
   *
   * <p>Method under test: {@link ArrayByteSource#ofUtf8(String)}
   */
  @Test
  @DisplayName("Test ofUtf8(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ArrayByteSource.ofUtf8(String)"})
  void testOfUtf8() throws UnsupportedEncodingException {
    // Arrange and Act
    ArrayByteSource actualOfUtf8Result = ArrayByteSource.ofUtf8("Str");

    // Assert
    assertEquals("Str", actualOfUtf8Result.readUtf8());
    assertEquals("Str", actualOfUtf8Result.readUtf8UsingBom());
    ArrayByteSource toMd5Result = actualOfUtf8Result.toMd5();
    assertEquals("�̻�7�ݵ��W\u0012[�\u001b", toMd5Result.readUtf8());
    assertEquals("�̻�7�ݵ��W\u0012[�\u001b", toMd5Result.readUtf8UsingBom());
    assertEquals(16L, toMd5Result.size());
    assertEquals(3L, actualOfUtf8Result.size());
    assertFalse(toMd5Result.isEmpty());
    assertFalse(actualOfUtf8Result.isEmpty());
    Optional<String> fileName = actualOfUtf8Result.getFileName();
    assertFalse(fileName.isPresent());
    assertSame(fileName, toMd5Result.getFileName());
    byte[] expectedReadUnsafeResult = "Str".getBytes("UTF-8");
    assertArrayEquals(expectedReadUnsafeResult, actualOfUtf8Result.readUnsafe());
    assertArrayEquals(
        new byte[] {-21, -52, -69, -45, '7', -17, -78, -35, -75, -105, -100, 'W', 18, '[', -83, 27},
        toMd5Result.readUnsafe());
  }

  /**
   * Test {@link ArrayByteSource#from(InputStream, int)} with {@code inputStream}, {@code
   * expectedSize}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return readUtf8 is {@code AXAXAXAX}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#from(InputStream, int)}
   */
  @Test
  @DisplayName(
      "Test from(InputStream, int) with 'inputStream', 'expectedSize'; when three; then return readUtf8 is 'AXAXAXAX'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ArrayByteSource.from(InputStream, int)"})
  void testFromWithInputStreamExpectedSize_whenThree_thenReturnReadUtf8IsAxaxaxax()
      throws IOException {
    // Arrange
    ByteArrayInputStream inputStream = new ByteArrayInputStream("AXAXAXAX".getBytes("UTF-8"));

    // Act
    ArrayByteSource actualFromResult = ArrayByteSource.from(inputStream, 3);

    // Assert
    assertEquals("AXAXAXAX", actualFromResult.readUtf8());
    assertEquals("AXAXAXAX", actualFromResult.readUtf8UsingBom());
    ArrayByteSource toMd5Result = actualFromResult.toMd5();
    assertEquals("�\u001f�'?M\u0012��2bԿH��", toMd5Result.readUtf8());
    assertEquals("�\u001f�'?M\u0012��2bԿH��", toMd5Result.readUtf8UsingBom());
    int actualReadResult = inputStream.read(new byte[] {});
    assertEquals(-1, actualReadResult);
    assertEquals(16L, toMd5Result.size());
    assertEquals(8L, actualFromResult.size());
    assertFalse(toMd5Result.isEmpty());
    assertFalse(actualFromResult.isEmpty());
    Optional<String> fileName = actualFromResult.getFileName();
    assertFalse(fileName.isPresent());
    assertSame(fileName, toMd5Result.getFileName());
    byte[] expectedReadUnsafeResult = "AXAXAXAX".getBytes("UTF-8");
    assertArrayEquals(expectedReadUnsafeResult, actualFromResult.readUnsafe());
    assertArrayEquals(
        new byte[] {-94, 31, -88, '\'', '?', 'M', 18, -56, -60, '2', 'b', -44, -65, 'H', -73, -50},
        toMd5Result.readUnsafe());
  }

  /**
   * Test {@link ArrayByteSource#from(CheckedSupplier)} with {@code inputStreamSupplier}.
   *
   * <ul>
   *   <li>Then return readUtf8 is {@code AXAXAXAX}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#from(CheckedSupplier)}
   */
  @Test
  @DisplayName(
      "Test from(CheckedSupplier) with 'inputStreamSupplier'; then return readUtf8 is 'AXAXAXAX'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ArrayByteSource.from(CheckedSupplier)"})
  void testFromWithInputStreamSupplier_thenReturnReadUtf8IsAxaxaxax() throws Throwable {
    // Arrange
    CheckedSupplier<InputStream> inputStreamSupplier = mock(CheckedSupplier.class);
    when(inputStreamSupplier.get())
        .thenReturn(new ByteArrayInputStream("AXAXAXAX".getBytes("UTF-8")));

    // Act
    ArrayByteSource actualFromResult = ArrayByteSource.from(inputStreamSupplier);

    // Assert
    verify(inputStreamSupplier).get();
    assertEquals("AXAXAXAX", actualFromResult.readUtf8());
    assertEquals("AXAXAXAX", actualFromResult.readUtf8UsingBom());
    ArrayByteSource toMd5Result = actualFromResult.toMd5();
    assertEquals("�\u001f�'?M\u0012��2bԿH��", toMd5Result.readUtf8());
    assertEquals("�\u001f�'?M\u0012��2bԿH��", toMd5Result.readUtf8UsingBom());
    assertEquals(16L, toMd5Result.size());
    assertEquals(8L, actualFromResult.size());
    assertFalse(toMd5Result.isEmpty());
    assertFalse(actualFromResult.isEmpty());
    Optional<String> fileName = actualFromResult.getFileName();
    assertFalse(fileName.isPresent());
    assertSame(fileName, toMd5Result.getFileName());
    byte[] expectedReadUnsafeResult = "AXAXAXAX".getBytes("UTF-8");
    assertArrayEquals(expectedReadUnsafeResult, actualFromResult.readUnsafe());
    assertArrayEquals(
        new byte[] {-94, 31, -88, '\'', '?', 'M', 18, -56, -60, '2', 'b', -44, -65, 'H', -73, -50},
        toMd5Result.readUnsafe());
  }

  /**
   * Test {@link ArrayByteSource#from(InputStream)} with {@code inputStream}.
   *
   * <ul>
   *   <li>Then return readUtf8 is {@code AXAXAXAX}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#from(InputStream)}
   */
  @Test
  @DisplayName("Test from(InputStream) with 'inputStream'; then return readUtf8 is 'AXAXAXAX'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ArrayByteSource.from(InputStream)"})
  void testFromWithInputStream_thenReturnReadUtf8IsAxaxaxax() throws IOException {
    // Arrange
    ByteArrayInputStream inputStream = new ByteArrayInputStream("AXAXAXAX".getBytes("UTF-8"));

    // Act
    ArrayByteSource actualFromResult = ArrayByteSource.from(inputStream);

    // Assert
    assertEquals("AXAXAXAX", actualFromResult.readUtf8());
    assertEquals("AXAXAXAX", actualFromResult.readUtf8UsingBom());
    ArrayByteSource toMd5Result = actualFromResult.toMd5();
    assertEquals("�\u001f�'?M\u0012��2bԿH��", toMd5Result.readUtf8());
    assertEquals("�\u001f�'?M\u0012��2bԿH��", toMd5Result.readUtf8UsingBom());
    int actualReadResult = inputStream.read(new byte[] {});
    assertEquals(-1, actualReadResult);
    assertEquals(16L, toMd5Result.size());
    assertEquals(8L, actualFromResult.size());
    assertFalse(toMd5Result.isEmpty());
    assertFalse(actualFromResult.isEmpty());
    Optional<String> fileName = actualFromResult.getFileName();
    assertFalse(fileName.isPresent());
    assertSame(fileName, toMd5Result.getFileName());
    byte[] expectedReadUnsafeResult = "AXAXAXAX".getBytes("UTF-8");
    assertArrayEquals(expectedReadUnsafeResult, actualFromResult.readUnsafe());
    assertArrayEquals(
        new byte[] {-94, 31, -88, '\'', '?', 'M', 18, -56, -60, '2', 'b', -44, -65, 'H', -73, -50},
        toMd5Result.readUnsafe());
  }

  /**
   * Test {@link ArrayByteSource#from(ByteSource)} with {@code other}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#from(ByteSource)}
   */
  @Test
  @DisplayName("Test from(ByteSource) with 'other'; then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ArrayByteSource.from(ByteSource)"})
  void testFromWithOther_thenThrowUncheckedIOException() {
    // Arrange, Act and Assert
    assertThrows(
        UncheckedIOException.class,
        () ->
            ArrayByteSource.from(
                FileByteSource.of(
                    Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile())));
  }

  /**
   * Test {@link ArrayByteSource#from(ByteSource)} with {@code other}.
   *
   * <ul>
   *   <li>When {@link ArrayByteSource#EMPTY}.
   *   <li>Then return readUtf8 is empty string.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#from(ByteSource)}
   */
  @Test
  @DisplayName(
      "Test from(ByteSource) with 'other'; when EMPTY; then return readUtf8 is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ArrayByteSource.from(ByteSource)"})
  void testFromWithOther_whenEmpty_thenReturnReadUtf8IsEmptyString() {
    // Arrange and Act
    ArrayByteSource actualFromResult = ArrayByteSource.from(ArrayByteSource.EMPTY);

    // Assert
    assertEquals("", actualFromResult.readUtf8());
    assertEquals("", actualFromResult.readUtf8UsingBom());
    ArrayByteSource toMd5Result = actualFromResult.toMd5();
    ArrayByteSource toMd5Result2 = toMd5Result.toMd5();
    assertEquals("Y��N�;\u0002��[9X'E?", toMd5Result2.readUtf8());
    assertEquals("Y��N�;\u0002��[9X'E?", toMd5Result2.readUtf8UsingBom());
    assertEquals("�\u001d�ُ\u0000�\u0004�\t���B~", toMd5Result.readUtf8());
    assertEquals("�\u001d�ُ\u0000�\u0004�\t���B~", toMd5Result.readUtf8UsingBom());
    assertEquals(0L, actualFromResult.size());
    assertTrue(actualFromResult.isEmpty());
    assertArrayEquals(new byte[] {}, actualFromResult.readUnsafe());
    assertArrayEquals(
        new byte[] {
          -44, 29, -116, -39, -113, 0, -78, 4, -23, Byte.MIN_VALUE, '\t', -104, -20, -8, 'B', '~'
        },
        toMd5Result.readUnsafe());
    assertArrayEquals(
        new byte[] {'Y', -83, -78, 'N', -13, -51, -66, 2, -105, -16, '[', '9', 'X', '\'', 'E', '?'},
        toMd5Result2.readUnsafe());
  }

  /**
   * Test {@link ArrayByteSource#fromOutput(CheckedConsumer)}.
   *
   * <ul>
   *   <li>Then return readUtf8 is empty string.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#fromOutput(CheckedConsumer)}
   */
  @Test
  @DisplayName("Test fromOutput(CheckedConsumer); then return readUtf8 is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ArrayByteSource.fromOutput(CheckedConsumer)"})
  void testFromOutput_thenReturnReadUtf8IsEmptyString() throws Throwable {
    // Arrange
    CheckedConsumer<OutputStream> handler = mock(CheckedConsumer.class);
    doNothing().when(handler).accept(Mockito.<OutputStream>any());

    // Act
    ArrayByteSource actualFromOutputResult = ArrayByteSource.fromOutput(handler);

    // Assert
    verify(handler).accept(isA(OutputStream.class));
    assertEquals("", actualFromOutputResult.readUtf8());
    assertEquals("", actualFromOutputResult.readUtf8UsingBom());
    ArrayByteSource toMd5Result = actualFromOutputResult.toMd5();
    assertEquals("�\u001d�ُ\u0000�\u0004�\t���B~", toMd5Result.readUtf8());
    assertEquals("�\u001d�ُ\u0000�\u0004�\t���B~", toMd5Result.readUtf8UsingBom());
    assertEquals(0L, actualFromOutputResult.size());
    assertEquals(16L, toMd5Result.size());
    assertFalse(toMd5Result.isEmpty());
    Optional<String> fileName = actualFromOutputResult.getFileName();
    assertFalse(fileName.isPresent());
    assertTrue(actualFromOutputResult.isEmpty());
    assertSame(fileName, toMd5Result.getFileName());
    assertArrayEquals(new byte[] {}, actualFromOutputResult.readUnsafe());
    assertArrayEquals(
        new byte[] {
          -44, 29, -116, -39, -113, 0, -78, 4, -23, Byte.MIN_VALUE, '\t', -104, -20, -8, 'B', '~'
        },
        toMd5Result.readUnsafe());
  }

  /**
   * Test {@link ArrayByteSource#fromBase64(String)}.
   *
   * <p>Method under test: {@link ArrayByteSource#fromBase64(String)}
   */
  @Test
  @DisplayName("Test fromBase64(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ArrayByteSource.fromBase64(String)"})
  void testFromBase64() {
    // Arrange and Act
    ArrayByteSource actualFromBase64Result = ArrayByteSource.fromBase64("Base64");

    // Assert
    assertEquals("\u0005�\u001e�", actualFromBase64Result.readUtf8());
    assertEquals("\u0005�\u001e�", actualFromBase64Result.readUtf8UsingBom());
    ArrayByteSource toMd5Result = actualFromBase64Result.toMd5();
    assertEquals("|`�\u001a��{ ����<ɠ�", toMd5Result.readUtf8());
    assertEquals("|`�\u001a��{ ����<ɠ�", toMd5Result.readUtf8UsingBom());
    assertEquals(16L, toMd5Result.size());
    assertEquals(4L, actualFromBase64Result.size());
    assertFalse(toMd5Result.isEmpty());
    assertFalse(actualFromBase64Result.isEmpty());
    Optional<String> fileName = actualFromBase64Result.getFileName();
    assertFalse(fileName.isPresent());
    assertSame(fileName, toMd5Result.getFileName());
    assertArrayEquals(new byte[] {5, -85, 30, -21}, actualFromBase64Result.readUnsafe());
    assertArrayEquals(
        new byte[] {'|', '`', -55, 26, -99, -1, '{', ' ', -78, -63, -107, -44, '<', -55, -96, -23},
        toMd5Result.readUnsafe());
  }

  /**
   * Test {@link ArrayByteSource#fromHex(String)}.
   *
   * <p>Method under test: {@link ArrayByteSource#fromHex(String)}
   */
  @Test
  @DisplayName("Test fromHex(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ArrayByteSource.fromHex(String)"})
  void testFromHex() {
    // Arrange and Act
    ArrayByteSource actualFromHexResult = ArrayByteSource.fromHex("0123456789ABCDEF");

    // Assert
    assertEquals("\u0001#Eg����", actualFromHexResult.readUtf8());
    assertEquals("\u0001#Eg����", actualFromHexResult.readUtf8UsingBom());
    ArrayByteSource toMd5Result = actualFromHexResult.toMd5();
    assertEquals("��\u001d\u001f�I\u0010h�\u0010\u0007(>�D�", toMd5Result.readUtf8());
    assertEquals("��\u001d\u001f�I\u0010h�\u0010\u0007(>�D�", toMd5Result.readUtf8UsingBom());
    assertEquals(16L, toMd5Result.size());
    assertEquals(8L, actualFromHexResult.size());
    assertFalse(toMd5Result.isEmpty());
    assertFalse(actualFromHexResult.isEmpty());
    Optional<String> fileName = actualFromHexResult.getFileName();
    assertFalse(fileName.isPresent());
    assertSame(fileName, toMd5Result.getFileName());
    assertArrayEquals(
        new byte[] {1, '#', 'E', 'g', -119, -85, -51, -17}, actualFromHexResult.readUnsafe());
    assertArrayEquals(
        new byte[] {-95, -51, 29, 31, -58, 'I', 16, 'h', -39, 16, 7, '(', '>', -40, 'D', -119},
        toMd5Result.readUnsafe());
  }

  /**
   * Test {@link ArrayByteSource#ArrayByteSource(byte[], String)}.
   *
   * <ul>
   *   <li>When {@code AXAXAXAX} Bytes is {@code UTF-8}.
   *   <li>Then return FileNameOrThrow is {@code foo.txt}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#ArrayByteSource(byte[], String)}
   */
  @Test
  @DisplayName(
      "Test new ArrayByteSource(byte[], String); when 'AXAXAXAX' Bytes is 'UTF-8'; then return FileNameOrThrow is 'foo.txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArrayByteSource.<init>(byte[], String)"})
  void testNewArrayByteSource_whenAxaxaxaxBytesIsUtf8_thenReturnFileNameOrThrowIsFooTxt()
      throws UnsupportedEncodingException {
    // Arrange and Act
    ArrayByteSource actualArrayByteSource =
        new ArrayByteSource("AXAXAXAX".getBytes("UTF-8"), "foo.txt");

    // Assert
    assertEquals("foo.txt", actualArrayByteSource.getFileNameOrThrow());
    Optional<String> fileName = actualArrayByteSource.getFileName();
    assertEquals("foo.txt", fileName.get());
    ArrayByteSource toMd5Result = actualArrayByteSource.toMd5();
    assertFalse(toMd5Result.getFileName().isPresent());
    assertTrue(fileName.isPresent());
    ArrayByteSource toMd5Result2 = toMd5Result.toMd5();
    assertSame(toMd5Result2.getFileName(), toMd5Result2.getFileName());
    ArrayByteSource toMd5Result3 = toMd5Result2.toMd5();
    assertSame(toMd5Result3.getFileName(), toMd5Result3.getFileName());
    ArrayByteSource toMd5Result4 = toMd5Result3.toMd5();
    assertSame(toMd5Result4.getFileName(), toMd5Result4.getFileName());
    byte[] expectedReadUnsafeResult = "AXAXAXAX".getBytes("UTF-8");
    assertArrayEquals(expectedReadUnsafeResult, actualArrayByteSource.readUnsafe());
    assertArrayEquals(
        new byte[] {-78, -96, -12, -61, -123, -43, '=', -106, '4', '/', -19, -76, 25, -106, 0, -96},
        toMd5Result4.readUnsafe());
    assertArrayEquals(
        new byte[] {-94, 31, -88, '\'', '?', 'M', 18, -56, -60, '2', 'b', -44, -65, 'H', -73, -50},
        toMd5Result.readUnsafe());
    assertArrayEquals(
        new byte[] {-9, 29, '/', -9, -116, 15, 14, -120, 'k', -94, -108, 'A', -76, -23, '1', -85},
        toMd5Result2.readUnsafe());
    assertArrayEquals(
        new byte[] {
          '\t', 'k', 'C', -70, -73, '3', 'Y', '3', -114, -39, -66, -9, -102, -9, 'd', '4'
        },
        toMd5Result3.readUnsafe());
  }

  /**
   * Test {@link ArrayByteSource#ArrayByteSource(byte[], String)}.
   *
   * <ul>
   *   <li>When empty string.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#ArrayByteSource(byte[], String)}
   */
  @Test
  @DisplayName("Test new ArrayByteSource(byte[], String); when empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArrayByteSource.<init>(byte[], String)"})
  void testNewArrayByteSource_whenEmptyString() throws UnsupportedEncodingException {
    // Arrange and Act
    ArrayByteSource actualArrayByteSource =
        new ArrayByteSource(new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, "");

    // Assert
    byte[] expectedReadUnsafeResult = "AXAXAXAX".getBytes("UTF-8");
    assertArrayEquals(expectedReadUnsafeResult, actualArrayByteSource.readUnsafe());
    ArrayByteSource toMd5Result = actualArrayByteSource.toMd5();
    ArrayByteSource toMd5Result2 = toMd5Result.toMd5();
    ArrayByteSource toMd5Result3 = toMd5Result2.toMd5();
    ArrayByteSource toMd5Result4 = toMd5Result3.toMd5();
    assertArrayEquals(
        new byte[] {
          -46, 'I', 'g', 'H', -10, -8, -44, -116, '+', 7, -26, -61, -29, '-', -68, Byte.MAX_VALUE
        },
        toMd5Result4.toMd5().readUnsafe());
    assertArrayEquals(
        new byte[] {-78, -96, -12, -61, -123, -43, '=', -106, '4', '/', -19, -76, 25, -106, 0, -96},
        toMd5Result4.readUnsafe());
    assertArrayEquals(
        new byte[] {-94, 31, -88, '\'', '?', 'M', 18, -56, -60, '2', 'b', -44, -65, 'H', -73, -50},
        toMd5Result.readUnsafe());
    assertArrayEquals(
        new byte[] {-9, 29, '/', -9, -116, 15, 14, -120, 'k', -94, -108, 'A', -76, -23, '1', -85},
        toMd5Result2.readUnsafe());
    assertArrayEquals(
        new byte[] {
          '\t', 'k', 'C', -70, -73, '3', 'Y', '3', -114, -39, -66, -9, -102, -9, 'd', '4'
        },
        toMd5Result3.readUnsafe());
  }

  /**
   * Test {@link ArrayByteSource#ArrayByteSource(byte[], String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#ArrayByteSource(byte[], String)}
   */
  @Test
  @DisplayName("Test new ArrayByteSource(byte[], String); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArrayByteSource.<init>(byte[], String)"})
  void testNewArrayByteSource_whenNull() throws UnsupportedEncodingException {
    // Arrange and Act
    ArrayByteSource actualArrayByteSource =
        new ArrayByteSource(new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, null);

    // Assert
    byte[] expectedReadUnsafeResult = "AXAXAXAX".getBytes("UTF-8");
    assertArrayEquals(expectedReadUnsafeResult, actualArrayByteSource.readUnsafe());
    ArrayByteSource toMd5Result = actualArrayByteSource.toMd5();
    ArrayByteSource toMd5Result2 = toMd5Result.toMd5();
    ArrayByteSource toMd5Result3 = toMd5Result2.toMd5();
    ArrayByteSource toMd5Result4 = toMd5Result3.toMd5();
    assertArrayEquals(
        new byte[] {
          -46, 'I', 'g', 'H', -10, -8, -44, -116, '+', 7, -26, -61, -29, '-', -68, Byte.MAX_VALUE
        },
        toMd5Result4.toMd5().readUnsafe());
    assertArrayEquals(
        new byte[] {-78, -96, -12, -61, -123, -43, '=', -106, '4', '/', -19, -76, 25, -106, 0, -96},
        toMd5Result4.readUnsafe());
    assertArrayEquals(
        new byte[] {-94, 31, -88, '\'', '?', 'M', 18, -56, -60, '2', 'b', -44, -65, 'H', -73, -50},
        toMd5Result.readUnsafe());
    assertArrayEquals(
        new byte[] {-9, 29, '/', -9, -116, 15, 14, -120, 'k', -94, -108, 'A', -76, -23, '1', -85},
        toMd5Result2.readUnsafe());
    assertArrayEquals(
        new byte[] {
          '\t', 'k', 'C', -70, -73, '3', 'Y', '3', -114, -39, -66, -9, -102, -9, 'd', '4'
        },
        toMd5Result3.readUnsafe());
  }

  /**
   * Test {@link ArrayByteSource#metaBean()}.
   *
   * <p>Method under test: {@link ArrayByteSource#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaBean ArrayByteSource.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    MetaBean actualMetaBeanResult = ArrayByteSource.EMPTY.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof Meta);
    assertTrue(actualMetaBeanResult.isBuildable());
  }

  /**
   * Test {@link ArrayByteSource#getFileName()}.
   *
   * <p>Method under test: {@link ArrayByteSource#getFileName()}
   */
  @Test
  @DisplayName("Test getFileName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional ArrayByteSource.getFileName()"})
  void testGetFileName() {
    // Arrange, Act and Assert
    assertFalse(ArrayByteSource.EMPTY.getFileName().isPresent());
  }

  /**
   * Test {@link ArrayByteSource#withFileName(String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return {@link ArrayByteSource#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#withFileName(String)}
   */
  @Test
  @DisplayName("Test withFileName(String); when empty string; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ArrayByteSource.withFileName(String)"})
  void testWithFileName_whenEmptyString_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(ArrayByteSource.EMPTY, ArrayByteSource.EMPTY.withFileName(""));
  }

  /**
   * Test {@link ArrayByteSource#withFileName(String)}.
   *
   * <ul>
   *   <li>When {@code foo.txt}.
   *   <li>Then return FileNameOrThrow is {@code foo.txt}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#withFileName(String)}
   */
  @Test
  @DisplayName(
      "Test withFileName(String); when 'foo.txt'; then return FileNameOrThrow is 'foo.txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ArrayByteSource.withFileName(String)"})
  void testWithFileName_whenFooTxt_thenReturnFileNameOrThrowIsFooTxt() {
    // Arrange and Act
    ArrayByteSource actualWithFileNameResult = ArrayByteSource.EMPTY.withFileName("foo.txt");

    // Assert
    assertEquals("foo.txt", actualWithFileNameResult.getFileNameOrThrow());
    Optional<String> fileName = actualWithFileNameResult.getFileName();
    assertEquals("foo.txt", fileName.get());
    ArrayByteSource toMd5Result = actualWithFileNameResult.toMd5();
    assertFalse(toMd5Result.getFileName().isPresent());
    assertTrue(fileName.isPresent());
    ArrayByteSource toMd5Result2 = toMd5Result.toMd5();
    ArrayByteSource toMd5Result3 = toMd5Result2.toMd5();
    ArrayByteSource toMd5Result4 = toMd5Result3.toMd5();
    assertSame(toMd5Result4.getFileName(), toMd5Result4.getFileName());
    assertSame(toMd5Result3.getFileName(), toMd5Result3.getFileName());
    assertSame(toMd5Result2.getFileName(), toMd5Result2.getFileName());
    assertArrayEquals(
        new byte[] {
          -117, -127, 'T', -16, ';', 'u', -11, -118, 'l', 'p', '"', '5', -65, 'd', '6', ')'
        },
        toMd5Result3.readUnsafe());
    assertArrayEquals(
        new byte[] {
          -44, 29, -116, -39, -113, 0, -78, 4, -23, Byte.MIN_VALUE, '\t', -104, -20, -8, 'B', '~'
        },
        toMd5Result.readUnsafe());
    assertArrayEquals(
        new byte[] {'Y', -83, -78, 'N', -13, -51, -66, 2, -105, -16, '[', '9', 'X', '\'', 'E', '?'},
        toMd5Result2.readUnsafe());
    assertArrayEquals(
        new byte[] {'\n', '1', 'O', -26, 22, 14, '6', 20, ')', -35, -106, -94, -80, -104, 18, 'k'},
        toMd5Result4.readUnsafe());
  }

  /**
   * Test {@link ArrayByteSource#readUnsafe()}.
   *
   * <p>Method under test: {@link ArrayByteSource#readUnsafe()}
   */
  @Test
  @DisplayName("Test readUnsafe()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] ArrayByteSource.readUnsafe()"})
  void testReadUnsafe() {
    // Arrange, Act and Assert
    assertArrayEquals(new byte[] {}, ArrayByteSource.EMPTY.readUnsafe());
  }

  /**
   * Test {@link ArrayByteSource#readUtf8()}.
   *
   * <p>Method under test: {@link ArrayByteSource#readUtf8()}
   */
  @Test
  @DisplayName("Test readUtf8()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ArrayByteSource.readUtf8()"})
  void testReadUtf8() {
    // Arrange, Act and Assert
    assertEquals("", ArrayByteSource.EMPTY.readUtf8());
  }

  /**
   * Test {@link ArrayByteSource#readUtf8UsingBom()}.
   *
   * <p>Method under test: {@link ArrayByteSource#readUtf8UsingBom()}
   */
  @Test
  @DisplayName("Test readUtf8UsingBom()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ArrayByteSource.readUtf8UsingBom()"})
  void testReadUtf8UsingBom() {
    // Arrange, Act and Assert
    assertEquals("\u0005�\u001e�", ArrayByteSource.fromBase64("Base64").readUtf8UsingBom());
  }

  /**
   * Test {@link ArrayByteSource#readUtf8UsingBom()}.
   *
   * <ul>
   *   <li>Given {@link ArrayByteSource#EMPTY}.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#readUtf8UsingBom()}
   */
  @Test
  @DisplayName("Test readUtf8UsingBom(); given EMPTY; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ArrayByteSource.readUtf8UsingBom()"})
  void testReadUtf8UsingBom_givenEmpty_thenReturnEmptyString() {
    // Arrange, Act and Assert
    assertEquals("", ArrayByteSource.EMPTY.readUtf8UsingBom());
  }

  /**
   * Test {@link ArrayByteSource#asCharSourceUtf8()}.
   *
   * <p>Method under test: {@link ArrayByteSource#asCharSourceUtf8()}
   */
  @Test
  @DisplayName("Test asCharSourceUtf8()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StringCharSource ArrayByteSource.asCharSourceUtf8()"})
  void testAsCharSourceUtf8() {
    // Arrange, Act and Assert
    assertEquals(StringCharSource.EMPTY, ArrayByteSource.EMPTY.asCharSourceUtf8());
  }

  /**
   * Test {@link ArrayByteSource#asCharSource(Charset)}.
   *
   * <ul>
   *   <li>When forName {@code UTF-8}.
   *   <li>Then return {@link StringCharSource#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#asCharSource(Charset)}
   */
  @Test
  @DisplayName("Test asCharSource(Charset); when forName 'UTF-8'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StringCharSource ArrayByteSource.asCharSource(Charset)"})
  void testAsCharSource_whenForNameUtf8_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(
        StringCharSource.EMPTY, ArrayByteSource.EMPTY.asCharSource(Charset.forName("UTF-8")));
  }

  /**
   * Test {@link ArrayByteSource#asCharSourceUtf8UsingBom()}.
   *
   * <p>Method under test: {@link ArrayByteSource#asCharSourceUtf8UsingBom()}
   */
  @Test
  @DisplayName("Test asCharSourceUtf8UsingBom()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StringCharSource ArrayByteSource.asCharSourceUtf8UsingBom()"})
  void testAsCharSourceUtf8UsingBom() {
    // Arrange and Act
    StringCharSource actualAsCharSourceUtf8UsingBomResult =
        ArrayByteSource.fromBase64("Base64").asCharSourceUtf8UsingBom();

    // Assert
    assertEquals("\u0005�\u001e�", actualAsCharSourceUtf8UsingBomResult.readFirstLine());
    ImmutableList<String> readLinesResult = actualAsCharSourceUtf8UsingBomResult.readLines();
    assertEquals(1, readLinesResult.size());
    assertEquals("\u0005�\u001e�", readLinesResult.get(0));
    assertEquals(4L, actualAsCharSourceUtf8UsingBomResult.length());
    assertFalse(actualAsCharSourceUtf8UsingBomResult.isEmpty());
  }

  /**
   * Test {@link ArrayByteSource#asCharSourceUtf8UsingBom()}.
   *
   * <ul>
   *   <li>Given {@link ArrayByteSource#EMPTY}.
   *   <li>Then return {@link StringCharSource#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#asCharSourceUtf8UsingBom()}
   */
  @Test
  @DisplayName("Test asCharSourceUtf8UsingBom(); given EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StringCharSource ArrayByteSource.asCharSourceUtf8UsingBom()"})
  void testAsCharSourceUtf8UsingBom_givenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(StringCharSource.EMPTY, ArrayByteSource.EMPTY.asCharSourceUtf8UsingBom());
  }

  /**
   * Test {@link ArrayByteSource#hash(HashFunction)}.
   *
   * <ul>
   *   <li>Given {@link HashCode}.
   *   <li>Then calls {@link HashFunction#hashBytes(byte[])}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#hash(HashFunction)}
   */
  @Test
  @DisplayName("Test hash(HashFunction); given HashCode; then calls hashBytes(byte[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HashCode ArrayByteSource.hash(HashFunction)"})
  void testHash_givenHashCode_thenCallsHashBytes() {
    // Arrange
    HashFunction hashFunction = mock(HashFunction.class);
    when(hashFunction.hashBytes(Mockito.<byte[]>any())).thenReturn(mock(HashCode.class));

    // Act
    ArrayByteSource.EMPTY.hash(hashFunction);

    // Assert
    verify(hashFunction).hashBytes(isA(byte[].class));
  }

  /**
   * Test {@link ArrayByteSource#toMd5()}.
   *
   * <p>Method under test: {@link ArrayByteSource#toMd5()}
   */
  @Test
  @DisplayName("Test toMd5()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ArrayByteSource.toMd5()"})
  void testToMd5() {
    // Arrange and Act
    ArrayByteSource actualToMd5Result = ArrayByteSource.EMPTY.toMd5();

    // Assert
    assertEquals("�\u001d�ُ\u0000�\u0004�\t���B~", actualToMd5Result.readUtf8());
    assertEquals("�\u001d�ُ\u0000�\u0004�\t���B~", actualToMd5Result.readUtf8UsingBom());
    assertEquals(16L, actualToMd5Result.size());
    assertFalse(actualToMd5Result.isEmpty());
    assertFalse(actualToMd5Result.getFileName().isPresent());
    assertArrayEquals(
        new byte[] {
          -44, 29, -116, -39, -113, 0, -78, 4, -23, Byte.MIN_VALUE, '\t', -104, -20, -8, 'B', '~'
        },
        actualToMd5Result.readUnsafe());
  }

  /**
   * Test {@link ArrayByteSource#toSha512()}.
   *
   * <p>Method under test: {@link ArrayByteSource#toSha512()}
   */
  @Test
  @DisplayName("Test toSha512()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ArrayByteSource.toSha512()"})
  void testToSha512() {
    // Arrange and Act
    ArrayByteSource actualToSha512Result = ArrayByteSource.fromBase64("Base64").toSha512();

    // Assert
    ArrayByteSource toMd5Result = actualToSha512Result.toMd5();
    assertEquals("\t<�0׌h\u000f��ԛ\u0010��t", toMd5Result.readUtf8());
    assertEquals("\t<�0׌h\u000f��ԛ\u0010��t", toMd5Result.readUtf8UsingBom());
    ArrayByteSource toMd5Result2 = toMd5Result.toMd5();
    assertEquals("��Ư\u0011�>`;Z���+�", toMd5Result2.readUtf8());
    assertEquals("��Ư\u0011�>`;Z���+�", toMd5Result2.readUtf8UsingBom());
    assertEquals(
        "��wS���B�wb��K��8�1O�^d\u0007��@�6\u0003�\u0001\u001e\fh��T�6K�`�7�\u0001��;fs{O=3\b���'@\to",
        actualToSha512Result.readUtf8());
    assertEquals(
        "��wS���B�wb��K��8�1O�^d\u0007��@�6\u0003�\u0001\u001e\fh��T�6K�`�7�\u0001��;fs{O=3\b���'@\to",
        actualToSha512Result.readUtf8UsingBom());
    assertArrayEquals(
        new byte[] {
          -68, -68, -58, -81, 17, -32, -92, '>', '`', ';', 'Z', -119, -100, -56, '+', -47
        },
        toMd5Result2.readUnsafe());
    assertArrayEquals(
        new byte[] {
          '\t', '<', -122, '0', -41, -116, 'h', 15, -82, -90, -44, -101, 16, -94, -96, 't'
        },
        toMd5Result.readUnsafe());
    assertArrayEquals(
        new byte[] {
          -13, -50, 'w', 'S', -28, -28, -4, 'B', -124, 'w', 'b', -78, -97, 'K', -111, -73, '8', -50,
          '1', 'O', -2, '^', 'd', 7, -112, -18, '@', -56, '6', 3, -68, 1, 30, '\f', 'h', -33, -63,
          'T', -57, '6', 'K', -22, '`', -79, '7', -9, 1, -74, -9, ';', 'f', 's', '{', 'O', '=', '3',
          '\b', -101, -64, -78, '\'', '@', '\t', 'o'
        },
        actualToSha512Result.readUnsafe());
  }

  /**
   * Test {@link ArrayByteSource#toSha512()}.
   *
   * <ul>
   *   <li>Then return toMd5 readUnsafe is array of {@code byte} with minus twenty-three and {@code
   *       s}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#toSha512()}
   */
  @Test
  @DisplayName(
      "Test toSha512(); then return toMd5 readUnsafe is array of byte with minus twenty-three and 's'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ArrayByteSource.toSha512()"})
  void testToSha512_thenReturnToMd5ReadUnsafeIsArrayOfByteWithMinusTwentyThreeAndS() {
    // Arrange and Act
    ArrayByteSource actualToSha512Result = ArrayByteSource.EMPTY.toSha512();

    // Assert
    assertEquals(
        "σ�5~︽�T(P�m�\u0007� �\u0005\u000bW\u0015܃��!�l��G��<]����\u0018҇~�/c�1�GAz��82z�'�>",
        actualToSha512Result.readUtf8());
    assertEquals(
        "σ�5~︽�T(P�m�\u0007� �\u0005\u000bW\u0015܃��!�l��G��<]����\u0018҇~�/c�1�GAz��82z�'�>",
        actualToSha512Result.readUtf8UsingBom());
    ArrayByteSource toMd5Result = actualToSha512Result.toMd5();
    ArrayByteSource toMd5Result2 = toMd5Result.toMd5();
    assertEquals("�\u0005\fD\u0015\u0011A�T%��\u0002��", toMd5Result2.readUtf8());
    assertEquals("�\u0005\fD\u0015\u0011A�T%��\u0002��", toMd5Result2.readUtf8UsingBom());
    assertEquals("�s-z�HF]����{hdJ", toMd5Result.readUtf8());
    assertEquals("�s-z�HF]����{hdJ", toMd5Result.readUtf8UsingBom());
    assertArrayEquals(
        new byte[] {
          -23, 's', '-', 'z', -52, 'H', 'F', ']', -120, -104, -80, -14, '{', 'h', 'd', 'J'
        },
        toMd5Result.readUnsafe());
    assertArrayEquals(
        new byte[] {
          -7, 5, '\f', 'D', 21, 17, 'A', -36, 'T', '%', -70, -78, 2, -84, -113, Byte.MAX_VALUE
        },
        toMd5Result2.readUnsafe());
    assertArrayEquals(
        new byte[] {
          -49,
          -125,
          -31,
          '5',
          '~',
          -17,
          -72,
          -67,
          -15,
          'T',
          '(',
          'P',
          -42,
          'm',
          Byte.MIN_VALUE,
          7,
          -42,
          ' ',
          -28,
          5,
          11,
          'W',
          21,
          -36,
          -125,
          -12,
          -87,
          '!',
          -45,
          'l',
          -23,
          -50,
          'G',
          -48,
          -47,
          '<',
          ']',
          -123,
          -14,
          -80,
          -1,
          -125,
          24,
          -46,
          -121,
          '~',
          -20,
          '/',
          'c',
          -71,
          '1',
          -67,
          'G',
          'A',
          'z',
          -127,
          -91,
          '8',
          '2',
          'z',
          -7,
          '\'',
          -38,
          '>'
        },
        actualToSha512Result.readUnsafe());
  }

  /**
   * Test {@link ArrayByteSource#toBase64()}.
   *
   * <p>Method under test: {@link ArrayByteSource#toBase64()}
   */
  @Test
  @DisplayName("Test toBase64()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ArrayByteSource.toBase64()"})
  void testToBase64() {
    // Arrange, Act and Assert
    assertEquals(ArrayByteSource.EMPTY, ArrayByteSource.EMPTY.toBase64());
  }

  /**
   * Test {@link ArrayByteSource#toBase64String()}.
   *
   * <p>Method under test: {@link ArrayByteSource#toBase64String()}
   */
  @Test
  @DisplayName("Test toBase64String()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ArrayByteSource.toBase64String()"})
  void testToBase64String() {
    // Arrange, Act and Assert
    assertEquals("", ArrayByteSource.EMPTY.toBase64String());
  }

  /**
   * Test {@link ArrayByteSource#encode(ByteSourceCodec)}.
   *
   * <p>Method under test: {@link ArrayByteSource#encode(ByteSourceCodec)}
   */
  @Test
  @DisplayName("Test encode(ByteSourceCodec)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ArrayByteSource.encode(ByteSourceCodec)"})
  void testEncode() {
    // Arrange and Act
    ArrayByteSource actualEncodeResult = ArrayByteSource.EMPTY.encode(ByteSourceCodec.GZ);

    // Assert
    ArrayByteSource toMd5Result = actualEncodeResult.toMd5();
    assertEquals("\u0016;਌p�b��\u0016۪��j", toMd5Result.readUtf8());
    assertEquals("\u0016;਌p�b��\u0016۪��j", toMd5Result.readUtf8UsingBom());
    assertEquals(
        "\u001f�\b\u0000\u0000\u0000\u0000\u0000\u0000�\u0003\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000",
        actualEncodeResult.readUtf8());
    assertEquals(
        "\u001f�\b\u0000\u0000\u0000\u0000\u0000\u0000�\u0003\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000",
        actualEncodeResult.readUtf8UsingBom());
    ArrayByteSource toMd5Result2 = toMd5Result.toMd5();
    assertEquals("}�@x�8݇֯\u00058\u0015,\u0004�", toMd5Result2.readUtf8());
    assertEquals("}�@x�8݇֯\u00058\u0015,\u0004�", toMd5Result2.readUtf8UsingBom());
    assertEquals(20L, actualEncodeResult.size());
    assertArrayEquals(
        new byte[] {22, ';', -32, -88, -116, 'p', -54, 'b', -97, -43, 22, -37, -86, -38, -39, 'j'},
        toMd5Result.readUnsafe());
    assertArrayEquals(
        new byte[] {'}', -21, '@', 'x', -14, '8', -35, -121, -42, -81, 5, '8', 21, ',', 4, -23},
        toMd5Result2.readUnsafe());
    assertArrayEquals(
        new byte[] {31, -117, '\b', 0, 0, 0, 0, 0, 0, -1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        actualEncodeResult.readUnsafe());
  }

  /**
   * Test {@link ArrayByteSource#encode(ByteSourceCodec)}.
   *
   * <ul>
   *   <li>When {@code BASE64}.
   *   <li>Then return {@link ArrayByteSource#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#encode(ByteSourceCodec)}
   */
  @Test
  @DisplayName("Test encode(ByteSourceCodec); when 'BASE64'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ArrayByteSource.encode(ByteSourceCodec)"})
  void testEncode_whenBase64_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(ArrayByteSource.EMPTY, ArrayByteSource.EMPTY.encode(ByteSourceCodec.BASE64));
  }

  /**
   * Test {@link ArrayByteSource#encode(ByteSourceCodec)}.
   *
   * <ul>
   *   <li>When {@code GZ_BASE64}.
   *   <li>Then return readUtf8 is {@code H4sIAAAAAAAA/wMAAAAAAAAAAAA=}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#encode(ByteSourceCodec)}
   */
  @Test
  @DisplayName(
      "Test encode(ByteSourceCodec); when 'GZ_BASE64'; then return readUtf8 is 'H4sIAAAAAAAA/wMAAAAAAAAAAAA='")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ArrayByteSource.encode(ByteSourceCodec)"})
  void testEncode_whenGzBase64_thenReturnReadUtf8IsH4sIAAAAAAAAWMAAAAAAAAAAAA()
      throws UnsupportedEncodingException {
    // Arrange and Act
    ArrayByteSource actualEncodeResult = ArrayByteSource.EMPTY.encode(ByteSourceCodec.GZ_BASE64);

    // Assert
    assertEquals("H4sIAAAAAAAA/wMAAAAAAAAAAAA=", actualEncodeResult.readUtf8());
    assertEquals("H4sIAAAAAAAA/wMAAAAAAAAAAAA=", actualEncodeResult.readUtf8UsingBom());
    ArrayByteSource toMd5Result = actualEncodeResult.toMd5();
    ArrayByteSource toMd5Result2 = toMd5Result.toMd5();
    assertEquals("\u00109\u001c=�\u0012S^ �l���s<", toMd5Result2.readUtf8());
    assertEquals("\u00109\u001c=�\u0012S^ �l���s<", toMd5Result2.readUtf8UsingBom());
    assertEquals("�P�Wth\\�_\u001el�����", toMd5Result.readUtf8());
    assertEquals("�P�Wth\\�_\u001el�����", toMd5Result.readUtf8UsingBom());
    assertEquals(28L, actualEncodeResult.size());
    byte[] expectedReadUnsafeResult = "H4sIAAAAAAAA/wMAAAAAAAAAAAA=".getBytes("UTF-8");
    assertArrayEquals(expectedReadUnsafeResult, actualEncodeResult.readUnsafe());
    assertArrayEquals(
        new byte[] {-13, 'P', -25, 'W', 't', 'h', '\\', -80, '_', 30, 'l', -84, -47, -7, -71, -94},
        toMd5Result.readUnsafe());
    assertArrayEquals(
        new byte[] {16, '9', 28, '=', -34, 18, 'S', '^', ' ', -71, 'l', -93, -84, -119, 's', '<'},
        toMd5Result2.readUnsafe());
  }

  /**
   * Test {@link ArrayByteSource#decode(ByteSourceCodec)}.
   *
   * <ul>
   *   <li>Given {@link ArrayByteSource#EMPTY}.
   *   <li>When {@code BASE64}.
   *   <li>Then return {@link ArrayByteSource#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#decode(ByteSourceCodec)}
   */
  @Test
  @DisplayName("Test decode(ByteSourceCodec); given EMPTY; when 'BASE64'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ArrayByteSource.decode(ByteSourceCodec)"})
  void testDecode_givenEmpty_whenBase64_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(ArrayByteSource.EMPTY, ArrayByteSource.EMPTY.decode(ByteSourceCodec.BASE64));
  }

  /**
   * Test {@link ArrayByteSource#decode(ByteSourceCodec)}.
   *
   * <ul>
   *   <li>Given ofUtf8 {@code Str}.
   *   <li>When {@code BASE64}.
   *   <li>Then return toMd5 readUtf8 is a string.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#decode(ByteSourceCodec)}
   */
  @Test
  @DisplayName(
      "Test decode(ByteSourceCodec); given ofUtf8 'Str'; when 'BASE64'; then return toMd5 readUtf8 is a string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ArrayByteSource.decode(ByteSourceCodec)"})
  void testDecode_givenOfUtf8Str_whenBase64_thenReturnToMd5ReadUtf8IsAString() {
    // Arrange and Act
    ArrayByteSource actualDecodeResult =
        ArrayByteSource.ofUtf8("Str").decode(ByteSourceCodec.BASE64);

    // Assert
    ArrayByteSource toMd5Result = actualDecodeResult.toMd5();
    assertEquals(";\u001cۭУ��X�*��wp", toMd5Result.readUtf8());
    assertEquals(";\u001cۭУ��X�*��wp", toMd5Result.readUtf8UsingBom());
    assertEquals("J�", actualDecodeResult.readUtf8());
    assertEquals("J�", actualDecodeResult.readUtf8UsingBom());
    ArrayByteSource toMd5Result2 = toMd5Result.toMd5();
    assertEquals("w��g)\u000f�W�^}�>�", toMd5Result2.readUtf8());
    assertEquals("w��g)\u000f�W�^}�>�", toMd5Result2.readUtf8UsingBom());
    assertEquals(2L, actualDecodeResult.size());
    assertFalse(actualDecodeResult.isEmpty());
    assertArrayEquals(new byte[] {'J', -38}, actualDecodeResult.readUnsafe());
    assertArrayEquals(
        new byte[] {
          ';', 28, -37, -83, -48, -93, -117, -63, 'X', -106, '*', -78, -4, Byte.MAX_VALUE, 'w', 'p'
        },
        toMd5Result.readUnsafe());
    assertArrayEquals(
        new byte[] {'w', -14, -3, 'g', ')', 15, -14, -117, 'W', -16, '^', '}', -21, -124, '>', -56},
        toMd5Result2.readUnsafe());
  }

  /**
   * Test {@link ArrayByteSource#toHexString()}.
   *
   * <ul>
   *   <li>Given {@link ArrayByteSource#EMPTY}.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#toHexString()}
   */
  @Test
  @DisplayName("Test toHexString(); given EMPTY; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ArrayByteSource.toHexString()"})
  void testToHexString_givenEmpty_thenReturnEmptyString() {
    // Arrange, Act and Assert
    assertEquals("", ArrayByteSource.EMPTY.toHexString());
  }

  /**
   * Test {@link ArrayByteSource#toHexString()}.
   *
   * <ul>
   *   <li>Given fromBase64 {@code Base64}.
   *   <li>Then return {@code 05AB1EEB}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#toHexString()}
   */
  @Test
  @DisplayName("Test toHexString(); given fromBase64 'Base64'; then return '05AB1EEB'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ArrayByteSource.toHexString()"})
  void testToHexString_givenFromBase64Base64_thenReturn05ab1eeb() {
    // Arrange, Act and Assert
    assertEquals("05AB1EEB", ArrayByteSource.fromBase64("Base64").toHexString());
  }

  /**
   * Test {@link ArrayByteSource#openStream()}.
   *
   * <p>Method under test: {@link ArrayByteSource#openStream()}
   */
  @Test
  @DisplayName("Test openStream()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ByteArrayInputStream ArrayByteSource.openStream()"})
  void testOpenStream() throws IOException {
    // Arrange, Act and Assert
    int actualReadResult = ArrayByteSource.EMPTY.openStream().read(new byte[] {});
    assertEquals(-1, actualReadResult);
  }

  /**
   * Test {@link ArrayByteSource#openBufferedStream()}.
   *
   * <p>Method under test: {@link ArrayByteSource#openBufferedStream()}
   */
  @Test
  @DisplayName("Test openBufferedStream()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ByteArrayInputStream ArrayByteSource.openBufferedStream()"})
  void testOpenBufferedStream() throws IOException {
    // Arrange, Act and Assert
    int actualReadResult = ArrayByteSource.EMPTY.openBufferedStream().read(new byte[] {});
    assertEquals(-1, actualReadResult);
  }

  /**
   * Test {@link ArrayByteSource#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link ArrayByteSource#EMPTY}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given EMPTY; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ArrayByteSource.isEmpty()"})
  void testIsEmpty_givenEmpty_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(ArrayByteSource.EMPTY.isEmpty());
  }

  /**
   * Test {@link ArrayByteSource#isEmpty()}.
   *
   * <ul>
   *   <li>Given fromBase64 {@code Base64}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given fromBase64 'Base64'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ArrayByteSource.isEmpty()"})
  void testIsEmpty_givenFromBase64Base64_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(ArrayByteSource.fromBase64("Base64").isEmpty());
  }

  /**
   * Test {@link ArrayByteSource#sizeIfKnown()}.
   *
   * <p>Method under test: {@link ArrayByteSource#sizeIfKnown()}
   */
  @Test
  @DisplayName("Test sizeIfKnown()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.base.Optional ArrayByteSource.sizeIfKnown()"})
  void testSizeIfKnown() {
    // Arrange, Act and Assert
    Optional<Long> toJavaUtilResult = ArrayByteSource.EMPTY.sizeIfKnown().toJavaUtil();
    assertEquals(0L, toJavaUtilResult.get().longValue());
    assertTrue(toJavaUtilResult.isPresent());
  }

  /**
   * Test {@link ArrayByteSource#size()}.
   *
   * <p>Method under test: {@link ArrayByteSource#size()}
   */
  @Test
  @DisplayName("Test size()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long ArrayByteSource.size()"})
  void testSize() {
    // Arrange, Act and Assert
    assertEquals(0L, ArrayByteSource.EMPTY.size());
  }

  /**
   * Test {@link ArrayByteSource#slice(long, long)}.
   *
   * <ul>
   *   <li>Given {@link ArrayByteSource#EMPTY}.
   *   <li>When one.
   *   <li>Then return {@link ArrayByteSource#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#slice(long, long)}
   */
  @Test
  @DisplayName("Test slice(long, long); given EMPTY; when one; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ArrayByteSource.slice(long, long)"})
  void testSlice_givenEmpty_whenOne_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertSame(ArrayByteSource.EMPTY, ArrayByteSource.EMPTY.slice(1L, 3L));
  }

  /**
   * Test {@link ArrayByteSource#slice(long, long)}.
   *
   * <ul>
   *   <li>Given fromHex {@code 0123456789ABCDEF}.
   *   <li>When one.
   *   <li>Then return readUtf8 is {@code #Eg}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#slice(long, long)}
   */
  @Test
  @DisplayName(
      "Test slice(long, long); given fromHex '0123456789ABCDEF'; when one; then return readUtf8 is '#Eg'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ArrayByteSource.slice(long, long)"})
  void testSlice_givenFromHex0123456789abcdef_whenOne_thenReturnReadUtf8IsEg()
      throws UnsupportedEncodingException {
    // Arrange and Act
    ArrayByteSource actualSliceResult = ArrayByteSource.fromHex("0123456789ABCDEF").slice(1L, 3L);

    // Assert
    assertEquals("#Eg", actualSliceResult.readUtf8());
    assertEquals("#Eg", actualSliceResult.readUtf8UsingBom());
    ArrayByteSource toMd5Result = actualSliceResult.toMd5();
    assertEquals("d�f�ϟC��kq3\u001c!\u001f�", toMd5Result.readUtf8());
    assertEquals("d�f�ϟC��kq3\u001c!\u001f�", toMd5Result.readUtf8UsingBom());
    ArrayByteSource toMd5Result2 = toMd5Result.toMd5();
    assertEquals("g͂ŭQniX\u0014Uy��X�", toMd5Result2.readUtf8());
    assertEquals("g͂ŭQniX\u0014Uy��X�", toMd5Result2.readUtf8UsingBom());
    assertEquals(3L, actualSliceResult.size());
    assertFalse(actualSliceResult.isEmpty());
    byte[] expectedReadUnsafeResult = "#Eg".getBytes("UTF-8");
    assertArrayEquals(expectedReadUnsafeResult, actualSliceResult.readUnsafe());
    assertArrayEquals(
        new byte[] {'d', -107, 'f', -116, -49, -97, 'C', -64, -11, 'k', 'q', '3', 28, '!', 31, -91},
        toMd5Result.readUnsafe());
    assertArrayEquals(
        new byte[] {'g', -51, -126, -59, -83, 'Q', 'n', 'i', 'X', 20, 'U', 'y', -52, -49, 'X', -39},
        toMd5Result2.readUnsafe());
  }

  /**
   * Test {@link ArrayByteSource#copyTo(OutputStream)} with {@code output}.
   *
   * <ul>
   *   <li>When {@link ByteArrayOutputStream#ByteArrayOutputStream()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#copyTo(OutputStream)}
   */
  @Test
  @DisplayName(
      "Test copyTo(OutputStream) with 'output'; when ByteArrayOutputStream(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long ArrayByteSource.copyTo(OutputStream)"})
  void testCopyToWithOutput_whenByteArrayOutputStream_thenReturnZero() throws IOException {
    // Arrange, Act and Assert
    assertEquals(0L, ArrayByteSource.EMPTY.copyTo(new ByteArrayOutputStream()));
  }

  /**
   * Test {@link ArrayByteSource#read()}.
   *
   * <p>Method under test: {@link ArrayByteSource#read()}
   */
  @Test
  @DisplayName("Test read()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] ArrayByteSource.read()"})
  void testRead() {
    // Arrange, Act and Assert
    assertArrayEquals(new byte[] {}, ArrayByteSource.EMPTY.read());
  }

  /**
   * Test {@link ArrayByteSource#read(ByteProcessor)} with {@code ByteProcessor}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return {@code Result}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#read(ByteProcessor)}
   */
  @Test
  @DisplayName("Test read(ByteProcessor) with 'ByteProcessor'; given 'true'; then return 'Result'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ArrayByteSource.read(ByteProcessor)"})
  void testReadWithByteProcessor_givenTrue_thenReturnResult() throws IOException {
    // Arrange
    ByteProcessor<Object> processor = mock(ByteProcessor.class);
    when(processor.processBytes(Mockito.<byte[]>any(), anyInt(), anyInt())).thenReturn(true);
    when(processor.getResult()).thenReturn("Result");

    // Act
    Object actualReadResult = ArrayByteSource.EMPTY.read(processor);

    // Assert
    verify(processor).getResult();
    verify(processor).processBytes(isA(byte[].class), eq(0), eq(0));
    assertEquals("Result", actualReadResult);
  }

  /**
   * Test {@link ArrayByteSource#contentEquals(ByteSource)}.
   *
   * <ul>
   *   <li>Given {@link ArrayByteSource#EMPTY}.
   *   <li>When {@link ArrayByteSource#EMPTY}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#contentEquals(ByteSource)}
   */
  @Test
  @DisplayName("Test contentEquals(ByteSource); given EMPTY; when EMPTY; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ArrayByteSource.contentEquals(ByteSource)"})
  void testContentEquals_givenEmpty_whenEmpty_thenReturnTrue() throws IOException {
    // Arrange, Act and Assert
    assertTrue(ArrayByteSource.EMPTY.contentEquals(ArrayByteSource.EMPTY));
  }

  /**
   * Test {@link ArrayByteSource#contentEquals(ByteSource)}.
   *
   * <ul>
   *   <li>Given fromBase64 {@code Base64}.
   *   <li>When {@link ArrayByteSource#EMPTY}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#contentEquals(ByteSource)}
   */
  @Test
  @DisplayName(
      "Test contentEquals(ByteSource); given fromBase64 'Base64'; when EMPTY; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ArrayByteSource.contentEquals(ByteSource)"})
  void testContentEquals_givenFromBase64Base64_whenEmpty_thenReturnFalse() throws IOException {
    // Arrange, Act and Assert
    assertFalse(ArrayByteSource.fromBase64("Base64").contentEquals(ArrayByteSource.EMPTY));
  }

  /**
   * Test {@link ArrayByteSource#load()}.
   *
   * <p>Method under test: {@link ArrayByteSource#load()}
   */
  @Test
  @DisplayName("Test load()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ArrayByteSource.load()"})
  void testLoad() {
    // Arrange, Act and Assert
    assertSame(ArrayByteSource.EMPTY, ArrayByteSource.EMPTY.load());
  }

  /**
   * Test {@link ArrayByteSource#equals(Object)}, and {@link ArrayByteSource#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ArrayByteSource#equals(Object)}
   *   <li>{@link ArrayByteSource#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ArrayByteSource.equals(Object)", "int ArrayByteSource.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ArrayByteSource arrayByteSource = ArrayByteSource.EMPTY;
    ArrayByteSource arrayByteSource2 = ArrayByteSource.EMPTY;

    // Act and Assert
    assertEquals(arrayByteSource, arrayByteSource2);
    assertEquals(arrayByteSource.hashCode(), arrayByteSource2.hashCode());
  }

  /**
   * Test {@link ArrayByteSource#equals(Object)}, and {@link ArrayByteSource#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ArrayByteSource#equals(Object)}
   *   <li>{@link ArrayByteSource#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ArrayByteSource.equals(Object)", "int ArrayByteSource.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    ArrayByteSource fromBase64Result = ArrayByteSource.fromBase64("Base64");
    ArrayByteSource fromBase64Result2 = ArrayByteSource.fromBase64("Base64");

    // Act and Assert
    assertEquals(fromBase64Result, fromBase64Result2);
    assertEquals(fromBase64Result.hashCode(), fromBase64Result2.hashCode());
  }

  /**
   * Test {@link ArrayByteSource#equals(Object)}, and {@link ArrayByteSource#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ArrayByteSource#equals(Object)}
   *   <li>{@link ArrayByteSource#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ArrayByteSource.equals(Object)", "int ArrayByteSource.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ArrayByteSource arrayByteSource = ArrayByteSource.EMPTY;

    // Act and Assert
    assertEquals(arrayByteSource, arrayByteSource);
    int expectedHashCodeResult = arrayByteSource.hashCode();
    assertEquals(expectedHashCodeResult, arrayByteSource.hashCode());
  }

  /**
   * Test {@link ArrayByteSource#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ArrayByteSource.equals(Object)", "int ArrayByteSource.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(ArrayByteSource.fromBase64("Base64"), ArrayByteSource.EMPTY);
  }

  /**
   * Test {@link ArrayByteSource#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ArrayByteSource.equals(Object)", "int ArrayByteSource.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(ArrayByteSource.EMPTY, null);
  }

  /**
   * Test {@link ArrayByteSource#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ArrayByteSource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ArrayByteSource.equals(Object)", "int ArrayByteSource.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(ArrayByteSource.EMPTY, "Different type to ArrayByteSource");
  }

  /**
   * Test {@link ArrayByteSource#toString()}.
   *
   * <p>Method under test: {@link ArrayByteSource#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ArrayByteSource.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("ArrayByteSource[0 bytes]", ArrayByteSource.EMPTY.toString());
  }
}
