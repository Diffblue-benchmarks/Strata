package com.opengamma.strata.collect.io;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.UncheckedIOException;
import java.io.UnsupportedEncodingException;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ByteSourceCodecDiffblueTest {
  /**
   * Test {@link ByteSourceCodec#of(String)}.
   *
   * <ul>
   *   <li>When {@code BASE64}.
   *   <li>Then return {@code BASE64}.
   * </ul>
   *
   * <p>Method under test: {@link ByteSourceCodec#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'BASE64'; then return 'BASE64'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ByteSourceCodec ByteSourceCodec.of(String)"})
  void testOf_whenBase64_thenReturnBase64() {
    // Arrange, Act and Assert
    assertEquals(ByteSourceCodec.BASE64, ByteSourceCodec.of("BASE64"));
  }

  /**
   * Test {@link ByteSourceCodec#toString()}.
   *
   * <p>Method under test: {@link ByteSourceCodec#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ByteSourceCodec.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Base64", ByteSourceCodec.valueOf("BASE64").toString());
  }

  /**
   * Test {@link ByteSourceCodec#encode(byte[], String)} with {@code bytes}, {@code fileName}.
   *
   * <ul>
   *   <li>Given {@code BASE64}.
   *   <li>Then return FileNameOrThrow is {@code foo.txt.base64}.
   * </ul>
   *
   * <p>Method under test: {@link ByteSourceCodec#encode(byte[], String)}
   */
  @Test
  @DisplayName(
      "Test encode(byte[], String) with 'bytes', 'fileName'; given 'BASE64'; then return FileNameOrThrow is 'foo.txt.base64'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ByteSourceCodec.encode(byte[], String)"})
  void testEncodeWithBytesFileName_givenBase64_thenReturnFileNameOrThrowIsFooTxtBase64()
      throws UnsupportedEncodingException {
    // Arrange and Act
    ArrayByteSource actualEncodeResult =
        ByteSourceCodec.BASE64.encode("AXAXAXAX".getBytes("UTF-8"), "foo.txt");

    // Assert
    assertEquals("foo.txt.base64", actualEncodeResult.getFileNameOrThrow());
    assertEquals("foo.txt.base64", actualEncodeResult.getFileName().get());
    ArrayByteSource toMd5Result = actualEncodeResult.toMd5();
    ArrayByteSource toMd5Result2 = toMd5Result.toMd5();
    ArrayByteSource toMd5Result3 = toMd5Result2.toMd5();
    ArrayByteSource toMd5Result4 = toMd5Result3.toMd5();
    ArrayByteSource toMd5Result5 = toMd5Result4.toMd5();
    assertSame(toMd5Result5.getFileName(), toMd5Result5.getFileName());
    assertSame(toMd5Result4.getFileName(), toMd5Result4.getFileName());
    assertSame(toMd5Result3.getFileName(), toMd5Result3.getFileName());
    assertSame(toMd5Result2.getFileName(), toMd5Result2.getFileName());
    byte[] expectedReadUnsafeResult = "QVhBWEFYQVg=".getBytes("UTF-8");
    assertArrayEquals(expectedReadUnsafeResult, actualEncodeResult.readUnsafe());
    assertArrayEquals(
        new byte[] {
          -69, '#', -109, '\r', -80, -109, 4, -109, -12, -37, -28, -46, '\r', -34, 11, -118
        },
        toMd5Result5.readUnsafe());
    assertArrayEquals(
        new byte[] {'#', 11, -125, ';', '<', -116, -64, -11, 'a', 3, 'e', -93, 7, -21, 23, -31},
        toMd5Result2.readUnsafe());
    assertArrayEquals(
        new byte[] {'\'', -113, -83, -2, -74, 27, -52, ':', -17, '[', -84, 'N', -95, 3, -90, -31},
        toMd5Result4.readUnsafe());
    assertArrayEquals(
        new byte[] {'@', -100, 'q', 3, -65, -6, 14, '"', 23, 'L', 'p', -38, -67, -52, -85, -47},
        toMd5Result.readUnsafe());
    assertArrayEquals(
        new byte[] {
          'z', 'x', '|', -36, Byte.MIN_VALUE, 't', 28, '-', -64, -41, '6', 'u', 19, -68, 'P', '*'
        },
        toMd5Result3.readUnsafe());
  }

  /**
   * Test {@link ByteSourceCodec#encode(byte[], String)} with {@code bytes}, {@code fileName}.
   *
   * <ul>
   *   <li>Given {@code BASE64}.
   *   <li>When {@code A}.
   *   <li>Then return not FileName Present.
   * </ul>
   *
   * <p>Method under test: {@link ByteSourceCodec#encode(byte[], String)}
   */
  @Test
  @DisplayName(
      "Test encode(byte[], String) with 'bytes', 'fileName'; given 'BASE64'; when 'A'; then return not FileName Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ByteSourceCodec.encode(byte[], String)"})
  void testEncodeWithBytesFileName_givenBase64_whenA_thenReturnNotFileNamePresent()
      throws UnsupportedEncodingException {
    // Arrange and Act
    ArrayByteSource actualEncodeResult =
        ByteSourceCodec.BASE64.encode(new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, null);

    // Assert
    Optional<String> fileName = actualEncodeResult.getFileName();
    assertFalse(fileName.isPresent());
    ArrayByteSource toMd5Result = actualEncodeResult.toMd5();
    ArrayByteSource toMd5Result2 = toMd5Result.toMd5();
    ArrayByteSource toMd5Result3 = toMd5Result2.toMd5();
    ArrayByteSource toMd5Result4 = toMd5Result3.toMd5();
    ArrayByteSource toMd5Result5 = toMd5Result4.toMd5();
    assertSame(fileName, toMd5Result5.getFileName());
    assertSame(fileName, toMd5Result4.getFileName());
    assertSame(fileName, toMd5Result3.getFileName());
    assertSame(fileName, toMd5Result2.getFileName());
    assertSame(fileName, toMd5Result.getFileName());
    byte[] expectedReadUnsafeResult = "QVhBWEFYQVg=".getBytes("UTF-8");
    assertArrayEquals(expectedReadUnsafeResult, actualEncodeResult.readUnsafe());
    assertArrayEquals(
        new byte[] {
          -69, '#', -109, '\r', -80, -109, 4, -109, -12, -37, -28, -46, '\r', -34, 11, -118
        },
        toMd5Result5.readUnsafe());
    assertArrayEquals(
        new byte[] {'#', 11, -125, ';', '<', -116, -64, -11, 'a', 3, 'e', -93, 7, -21, 23, -31},
        toMd5Result2.readUnsafe());
    assertArrayEquals(
        new byte[] {'\'', -113, -83, -2, -74, 27, -52, ':', -17, '[', -84, 'N', -95, 3, -90, -31},
        toMd5Result4.readUnsafe());
    assertArrayEquals(
        new byte[] {'@', -100, 'q', 3, -65, -6, 14, '"', 23, 'L', 'p', -38, -67, -52, -85, -47},
        toMd5Result.readUnsafe());
    assertArrayEquals(
        new byte[] {
          'z', 'x', '|', -36, Byte.MIN_VALUE, 't', 28, '-', -64, -41, '6', 'u', 19, -68, 'P', '*'
        },
        toMd5Result3.readUnsafe());
  }

  /**
   * Test {@link ByteSourceCodec#encode(byte[], String)} with {@code bytes}, {@code fileName}.
   *
   * <ul>
   *   <li>Given {@code GZ}.
   *   <li>Then return readUtf8 is a string.
   * </ul>
   *
   * <p>Method under test: {@link ByteSourceCodec#encode(byte[], String)}
   */
  @Test
  @DisplayName(
      "Test encode(byte[], String) with 'bytes', 'fileName'; given 'GZ'; then return readUtf8 is a string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ByteSourceCodec.encode(byte[], String)"})
  void testEncodeWithBytesFileName_givenGz_thenReturnReadUtf8IsAString()
      throws UnsupportedEncodingException {
    // Arrange and Act
    ArrayByteSource actualEncodeResult =
        ByteSourceCodec.GZ.encode("AXAXAXAX".getBytes("UTF-8"), "foo.txt");

    // Assert
    ArrayByteSource toMd5Result = actualEncodeResult.toMd5();
    ArrayByteSource toMd5Result2 = toMd5Result.toMd5();
    assertEquals("9��\u0019�(�^�\u0006\\�k�+{", toMd5Result2.readUtf8());
    assertEquals("9��\u0019�(�^�\u0006\\�k�+{", toMd5Result2.readUtf8UsingBom());
    assertEquals("\u001d���k��\u001c��g�\\�A", toMd5Result.readUtf8());
    assertEquals("\u001d���k��\u001c��g�\\�A", toMd5Result.readUtf8UsingBom());
    assertEquals(
        "\u001f�\b\u0000\u0000\u0000\u0000\u0000\u0000�s�p\u0004C\u0000�\u0000��\b\u0000\u0000\u0000",
        actualEncodeResult.readUtf8());
    assertEquals(
        "\u001f�\b\u0000\u0000\u0000\u0000\u0000\u0000�s�p\u0004C\u0000�\u0000��\b\u0000\u0000\u0000",
        actualEncodeResult.readUtf8UsingBom());
    assertEquals("foo.txt.gz", actualEncodeResult.getFileNameOrThrow());
    assertEquals("foo.txt.gz", actualEncodeResult.getFileName().get());
    assertEquals(24L, actualEncodeResult.size());
    assertSame(toMd5Result2.getFileName(), toMd5Result2.getFileName());
    assertArrayEquals(
        new byte[] {29, -120, -83, -100, 'k', -61, -14, 28, -15, -93, -9, 'g', -102, '\\', -2, 'A'},
        toMd5Result.readUnsafe());
    assertArrayEquals(
        new byte[] {'9', -20, -54, 25, -71, '(', -36, '^', -89, 6, '\\', -36, 'k', -18, '+', '{'},
        toMd5Result2.readUnsafe());
    assertArrayEquals(
        new byte[] {
          31, -117, '\b', 0, 0, 0, 0, 0, 0, -1, 's', -116, 'p', 4, 'C', 0, -37, 0, -99, -111, '\b',
          0, 0, 0
        },
        actualEncodeResult.readUnsafe());
  }

  /**
   * Test {@link ByteSourceCodec#encode(byte[], String)} with {@code bytes}, {@code fileName}.
   *
   * <ul>
   *   <li>Then return readUtf8 is {@code H4sIAAAAAAAA/3OMcARDANsAnZEIAAAA}.
   * </ul>
   *
   * <p>Method under test: {@link ByteSourceCodec#encode(byte[], String)}
   */
  @Test
  @DisplayName(
      "Test encode(byte[], String) with 'bytes', 'fileName'; then return readUtf8 is 'H4sIAAAAAAAA/3OMcARDANsAnZEIAAAA'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ByteSourceCodec.encode(byte[], String)"})
  void testEncodeWithBytesFileName_thenReturnReadUtf8IsH4sIAAAAAAAA3OMcARDANsAnZEIAAAA()
      throws UnsupportedEncodingException {
    // Arrange and Act
    ArrayByteSource actualEncodeResult =
        ByteSourceCodec.GZ_BASE64.encode("AXAXAXAX".getBytes("UTF-8"), "foo.txt");

    // Assert
    ArrayByteSource toMd5Result = actualEncodeResult.toMd5();
    assertEquals("*�\u000b��\u0010�A���9�D;�", toMd5Result.readUtf8());
    assertEquals("*�\u000b��\u0010�A���9�D;�", toMd5Result.readUtf8UsingBom());
    ArrayByteSource toMd5Result2 = toMd5Result.toMd5();
    assertEquals("+A�o�\u0011��4ǝ�_�//", toMd5Result2.readUtf8());
    assertEquals("+A�o�\u0011��4ǝ�_�//", toMd5Result2.readUtf8UsingBom());
    assertEquals("H4sIAAAAAAAA/3OMcARDANsAnZEIAAAA", actualEncodeResult.readUtf8());
    assertEquals("H4sIAAAAAAAA/3OMcARDANsAnZEIAAAA", actualEncodeResult.readUtf8UsingBom());
    assertEquals("foo.txt.gz.base64", actualEncodeResult.getFileNameOrThrow());
    assertEquals("foo.txt.gz.base64", actualEncodeResult.getFileName().get());
    assertEquals(32L, actualEncodeResult.size());
    assertSame(toMd5Result2.getFileName(), toMd5Result2.getFileName());
    byte[] expectedReadUnsafeResult = "H4sIAAAAAAAA/3OMcARDANsAnZEIAAAA".getBytes("UTF-8");
    assertArrayEquals(expectedReadUnsafeResult, actualEncodeResult.readUnsafe());
    assertArrayEquals(
        new byte[] {'*', -11, 11, -39, -34, 16, -15, 'A', -66, -113, -41, '9', -99, 'D', ';', -71},
        toMd5Result.readUnsafe());
    assertArrayEquals(
        new byte[] {
          '+', 'A', -105, 'o', -7, 17, -106, -14, '4', -57, -99, -16, '_', -102, '/', '/'
        },
        toMd5Result2.readUnsafe());
  }

  /**
   * Test {@link ByteSourceCodec#decode(byte[], String)} with {@code bytes}, {@code fileName}.
   *
   * <ul>
   *   <li>Then return FileNameOrThrow is {@code foo.txt}.
   * </ul>
   *
   * <p>Method under test: {@link ByteSourceCodec#decode(byte[], String)}
   */
  @Test
  @DisplayName(
      "Test decode(byte[], String) with 'bytes', 'fileName'; then return FileNameOrThrow is 'foo.txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ByteSourceCodec.decode(byte[], String)"})
  void testDecodeWithBytesFileName_thenReturnFileNameOrThrowIsFooTxt()
      throws UnsupportedEncodingException {
    // Arrange and Act
    ArrayByteSource actualDecodeResult =
        ByteSourceCodec.BASE64.decode("AXAXAXAX".getBytes("UTF-8"), "foo.txt");

    // Assert
    assertEquals("foo.txt", actualDecodeResult.getFileNameOrThrow());
    Optional<String> fileName = actualDecodeResult.getFileName();
    assertEquals("foo.txt", fileName.get());
    ArrayByteSource toMd5Result = actualDecodeResult.toMd5();
    assertFalse(toMd5Result.getFileName().isPresent());
    assertTrue(fileName.isPresent());
    ArrayByteSource toMd5Result2 = toMd5Result.toMd5();
    ArrayByteSource toMd5Result3 = toMd5Result2.toMd5();
    ArrayByteSource toMd5Result4 = toMd5Result3.toMd5();
    assertSame(toMd5Result4.getFileName(), toMd5Result4.getFileName());
    assertSame(toMd5Result3.getFileName(), toMd5Result3.getFileName());
    assertSame(toMd5Result2.getFileName(), toMd5Result2.getFileName());
    assertArrayEquals(new byte[] {1, 'p', 23, 1, 'p', 23}, actualDecodeResult.readUnsafe());
    assertArrayEquals(
        new byte[] {
          ')', -98, -97, -104, 'h', -123, 'Z', -121, ',', 'L', 'D', 'e', -122, -90, -61, -46
        },
        toMd5Result.readUnsafe());
    assertArrayEquals(
        new byte[] {'g', 5, -88, 'o', 'p', 25, -36, -26, -2, ']', -30, -68, '+', -82, 'G', 31},
        toMd5Result4.readUnsafe());
    assertArrayEquals(
        new byte[] {'j', -117, '9', '+', 'r', 'j', '>', '7', -81, 'Y', 21, 3, -120, -72, -117, -46},
        toMd5Result3.readUnsafe());
    assertArrayEquals(
        new byte[] {'k', -40, -40, 'B', 'W', ')', 'D', -113, '2', -13, -1, -91, -57, 26, -1, 'L'},
        toMd5Result2.readUnsafe());
  }

  /**
   * Test {@link ByteSourceCodec#decode(byte[], String)} with {@code bytes}, {@code fileName}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link ByteSourceCodec#decode(byte[], String)}
   */
  @Test
  @DisplayName(
      "Test decode(byte[], String) with 'bytes', 'fileName'; then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ByteSourceCodec.decode(byte[], String)"})
  void testDecodeWithBytesFileName_thenThrowUncheckedIOException() {
    // Arrange, Act and Assert
    assertThrows(
        UncheckedIOException.class,
        () ->
            ByteSourceCodec.BASE64.decode(
                new byte[] {1, 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, "foo.txt"));
  }

  /**
   * Test {@link ByteSourceCodec#decode(byte[], String)} with {@code bytes}, {@code fileName}.
   *
   * <ul>
   *   <li>When array of {@code byte} with {@code A} and {@code X}.
   * </ul>
   *
   * <p>Method under test: {@link ByteSourceCodec#decode(byte[], String)}
   */
  @Test
  @DisplayName(
      "Test decode(byte[], String) with 'bytes', 'fileName'; when array of byte with 'A' and 'X'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ByteSourceCodec.decode(byte[], String)"})
  void testDecodeWithBytesFileName_whenArrayOfByteWithAAndX() {
    // Arrange and Act
    ArrayByteSource actualDecodeResult =
        ByteSourceCodec.BASE64.decode(new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, null);

    // Assert
    assertArrayEquals(new byte[] {1, 'p', 23, 1, 'p', 23}, actualDecodeResult.readUnsafe());
    ArrayByteSource toMd5Result = actualDecodeResult.toMd5();
    assertArrayEquals(
        new byte[] {
          ')', -98, -97, -104, 'h', -123, 'Z', -121, ',', 'L', 'D', 'e', -122, -90, -61, -46
        },
        toMd5Result.readUnsafe());
    ArrayByteSource toMd5Result2 = toMd5Result.toMd5();
    ArrayByteSource toMd5Result3 = toMd5Result2.toMd5();
    ArrayByteSource toMd5Result4 = toMd5Result3.toMd5();
    assertArrayEquals(
        new byte[] {
          'H', -40, '8', -103, -30, -109, -73, ' ', -101, -3, -114, 'b', -58, -71, 20, -77
        },
        toMd5Result4.toMd5().readUnsafe());
    assertArrayEquals(
        new byte[] {'g', 5, -88, 'o', 'p', 25, -36, -26, -2, ']', -30, -68, '+', -82, 'G', 31},
        toMd5Result4.readUnsafe());
    assertArrayEquals(
        new byte[] {'j', -117, '9', '+', 'r', 'j', '>', '7', -81, 'Y', 21, 3, -120, -72, -117, -46},
        toMd5Result3.readUnsafe());
    assertArrayEquals(
        new byte[] {'k', -40, -40, 'B', 'W', ')', 'D', -113, '2', -13, -1, -91, -57, 26, -1, 'L'},
        toMd5Result2.readUnsafe());
  }

  /**
   * Test {@link ByteSourceCodec#decode(byte[], String)} with {@code bytes}, {@code fileName}.
   *
   * <ul>
   *   <li>When {@code .base64}.
   * </ul>
   *
   * <p>Method under test: {@link ByteSourceCodec#decode(byte[], String)}
   */
  @Test
  @DisplayName("Test decode(byte[], String) with 'bytes', 'fileName'; when '.base64'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource ByteSourceCodec.decode(byte[], String)"})
  void testDecodeWithBytesFileName_whenBase64() throws UnsupportedEncodingException {
    // Arrange and Act
    ArrayByteSource actualDecodeResult =
        ByteSourceCodec.BASE64.decode("AXAXAXAX".getBytes("UTF-8"), ".base64");

    // Assert
    assertArrayEquals(new byte[] {1, 'p', 23, 1, 'p', 23}, actualDecodeResult.readUnsafe());
    ArrayByteSource toMd5Result = actualDecodeResult.toMd5();
    assertArrayEquals(
        new byte[] {
          ')', -98, -97, -104, 'h', -123, 'Z', -121, ',', 'L', 'D', 'e', -122, -90, -61, -46
        },
        toMd5Result.readUnsafe());
    ArrayByteSource toMd5Result2 = toMd5Result.toMd5();
    ArrayByteSource toMd5Result3 = toMd5Result2.toMd5();
    ArrayByteSource toMd5Result4 = toMd5Result3.toMd5();
    assertArrayEquals(
        new byte[] {
          'H', -40, '8', -103, -30, -109, -73, ' ', -101, -3, -114, 'b', -58, -71, 20, -77
        },
        toMd5Result4.toMd5().readUnsafe());
    assertArrayEquals(
        new byte[] {'g', 5, -88, 'o', 'p', 25, -36, -26, -2, ']', -30, -68, '+', -82, 'G', 31},
        toMd5Result4.readUnsafe());
    assertArrayEquals(
        new byte[] {'j', -117, '9', '+', 'r', 'j', '>', '7', -81, 'Y', 21, 3, -120, -72, -117, -46},
        toMd5Result3.readUnsafe());
    assertArrayEquals(
        new byte[] {'k', -40, -40, 'B', 'W', ')', 'D', -113, '2', -13, -1, -91, -57, 26, -1, 'L'},
        toMd5Result2.readUnsafe());
  }
}
