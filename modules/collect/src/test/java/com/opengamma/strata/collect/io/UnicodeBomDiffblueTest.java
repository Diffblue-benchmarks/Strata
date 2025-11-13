package com.opengamma.strata.collect.io;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.io.ByteSource;
import com.google.common.io.CharSource;
import com.opengamma.strata.collect.io.UnicodeBom.UnicodeBomCharSource;
import com.opengamma.strata.collect.io.UnicodeBom.UnicodeBomCharSource.Meta;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.joda.beans.MetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UnicodeBomDiffblueTest {
  /**
   * Test {@link UnicodeBom#toString(byte[])} with {@code byte[]}.
   *
   * <ul>
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link UnicodeBom#toString(byte[])}
   */
  @Test
  @DisplayName("Test toString(byte[]) with 'byte[]'; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String UnicodeBom.toString(byte[])"})
  void testToStringWithByte_thenReturnEmptyString() {
    // Arrange, Act and Assert
    assertEquals("", UnicodeBom.toString(new byte[] {-17, -69, -65}));
  }

  /**
   * Test {@link UnicodeBom#toString(byte[])} with {@code byte[]}.
   *
   * <ul>
   *   <li>When {@code A}.
   *   <li>Then return replacement character A.
   * </ul>
   *
   * <p>Method under test: {@link UnicodeBom#toString(byte[])}
   */
  @Test
  @DisplayName("Test toString(byte[]) with 'byte[]'; when 'A'; then return replacement character A")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String UnicodeBom.toString(byte[])"})
  void testToStringWithByte_whenA_thenReturnReplacementCharacterA() {
    // Arrange, Act and Assert
    assertEquals("�A", UnicodeBom.toString(new byte[] {-17, -69, 'A'}));
  }

  /**
   * Test {@link UnicodeBom#toString(byte[])} with {@code byte[]}.
   *
   * <ul>
   *   <li>When array of {@code byte} with minus one and minus sixty-nine.
   * </ul>
   *
   * <p>Method under test: {@link UnicodeBom#toString(byte[])}
   */
  @Test
  @DisplayName(
      "Test toString(byte[]) with 'byte[]'; when array of byte with minus one and minus sixty-nine")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String UnicodeBom.toString(byte[])"})
  void testToStringWithByte_whenArrayOfByteWithMinusOneAndMinusSixtyNine() {
    // Arrange, Act and Assert
    assertEquals("���", UnicodeBom.toString(new byte[] {-1, -69, -65}));
  }

  /**
   * Test {@link UnicodeBom#toString(byte[])} with {@code byte[]}.
   *
   * <ul>
   *   <li>When array of {@code byte} with minus one and minus two.
   * </ul>
   *
   * <p>Method under test: {@link UnicodeBom#toString(byte[])}
   */
  @Test
  @DisplayName(
      "Test toString(byte[]) with 'byte[]'; when array of byte with minus one and minus two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String UnicodeBom.toString(byte[])"})
  void testToStringWithByte_whenArrayOfByteWithMinusOneAndMinusTwo() {
    // Arrange, Act and Assert
    assertEquals("�", UnicodeBom.toString(new byte[] {-1, -2, -65}));
  }

  /**
   * Test {@link UnicodeBom#toString(byte[])} with {@code byte[]}.
   *
   * <ul>
   *   <li>When array of {@code byte} with minus seventeen and minus one.
   * </ul>
   *
   * <p>Method under test: {@link UnicodeBom#toString(byte[])}
   */
  @Test
  @DisplayName(
      "Test toString(byte[]) with 'byte[]'; when array of byte with minus seventeen and minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String UnicodeBom.toString(byte[])"})
  void testToStringWithByte_whenArrayOfByteWithMinusSeventeenAndMinusOne() {
    // Arrange, Act and Assert
    assertEquals("���", UnicodeBom.toString(new byte[] {-17, -1, -65}));
  }

  /**
   * Test {@link UnicodeBom#toString(byte[])} with {@code byte[]}.
   *
   * <ul>
   *   <li>When array of {@code byte} with minus two and minus one.
   * </ul>
   *
   * <p>Method under test: {@link UnicodeBom#toString(byte[])}
   */
  @Test
  @DisplayName(
      "Test toString(byte[]) with 'byte[]'; when array of byte with minus two and minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String UnicodeBom.toString(byte[])"})
  void testToStringWithByte_whenArrayOfByteWithMinusTwoAndMinusOne() {
    // Arrange, Act and Assert
    assertEquals("�", UnicodeBom.toString(new byte[] {-2, -1, -65}));
  }

  /**
   * Test {@link UnicodeBom#toString(byte[])} with {@code byte[]}.
   *
   * <ul>
   *   <li>When array of {@code byte} with minus two and minus sixty-nine.
   * </ul>
   *
   * <p>Method under test: {@link UnicodeBom#toString(byte[])}
   */
  @Test
  @DisplayName(
      "Test toString(byte[]) with 'byte[]'; when array of byte with minus two and minus sixty-nine")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String UnicodeBom.toString(byte[])"})
  void testToStringWithByte_whenArrayOfByteWithMinusTwoAndMinusSixtyNine() {
    // Arrange, Act and Assert
    assertEquals("���", UnicodeBom.toString(new byte[] {-2, -69, -65}));
  }

  /**
   * Test {@link UnicodeBom#toString(byte[])} with {@code byte[]}.
   *
   * <ul>
   *   <li>When {@code AXAXAXAX} Bytes is {@code UTF-8}.
   *   <li>Then return {@code AXAXAXAX}.
   * </ul>
   *
   * <p>Method under test: {@link UnicodeBom#toString(byte[])}
   */
  @Test
  @DisplayName(
      "Test toString(byte[]) with 'byte[]'; when 'AXAXAXAX' Bytes is 'UTF-8'; then return 'AXAXAXAX'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String UnicodeBom.toString(byte[])"})
  void testToStringWithByte_whenAxaxaxaxBytesIsUtf8_thenReturnAxaxaxax()
      throws UnsupportedEncodingException {
    // Arrange, Act and Assert
    assertEquals("AXAXAXAX", UnicodeBom.toString("AXAXAXAX".getBytes("UTF-8")));
  }

  /**
   * Test {@link UnicodeBom#toString(byte[])} with {@code byte[]}.
   *
   * <ul>
   *   <li>When empty array of {@code byte}.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link UnicodeBom#toString(byte[])}
   */
  @Test
  @DisplayName(
      "Test toString(byte[]) with 'byte[]'; when empty array of byte; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String UnicodeBom.toString(byte[])"})
  void testToStringWithByte_whenEmptyArrayOfByte_thenReturnEmptyString() {
    // Arrange, Act and Assert
    assertEquals("", UnicodeBom.toString(new byte[] {}));
  }

  /**
   * Test {@link UnicodeBom#toCharSource(BeanByteSource)} with {@code BeanByteSource}.
   *
   * <ul>
   *   <li>When {@link ArrayByteSource#EMPTY}.
   *   <li>Then return {@link UnicodeBomCharSource}.
   * </ul>
   *
   * <p>Method under test: {@link UnicodeBom#toCharSource(BeanByteSource)}
   */
  @Test
  @DisplayName(
      "Test toCharSource(BeanByteSource) with 'BeanByteSource'; when EMPTY; then return UnicodeBomCharSource")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BeanCharSource UnicodeBom.toCharSource(BeanByteSource)"})
  void testToCharSourceWithBeanByteSource_whenEmpty_thenReturnUnicodeBomCharSource() {
    // Arrange and Act
    BeanCharSource actualToCharSourceResult = UnicodeBom.toCharSource(ArrayByteSource.EMPTY);

    // Assert
    assertTrue(actualToCharSourceResult instanceof UnicodeBomCharSource);
    assertNull(actualToCharSourceResult.readFirstLine());
    assertEquals(0L, actualToCharSourceResult.length());
    assertFalse(actualToCharSourceResult.getFileName().isPresent());
    assertTrue(actualToCharSourceResult.isEmpty());
    assertTrue(actualToCharSourceResult.readLines().isEmpty());
  }

  /**
   * Test {@link UnicodeBom#toCharSource(ByteSource)} with {@code ByteSource}.
   *
   * <p>Method under test: {@link UnicodeBom#toCharSource(ByteSource)}
   */
  @Test
  @DisplayName("Test toCharSource(ByteSource) with 'ByteSource'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CharSource UnicodeBom.toCharSource(ByteSource)"})
  void testToCharSourceWithByteSource() throws IOException {
    // Arrange and Act
    CharSource actualToCharSourceResult =
        UnicodeBom.toCharSource((ByteSource) ArrayByteSource.EMPTY);

    // Assert
    assertEquals(0L, actualToCharSourceResult.length());
    assertTrue(actualToCharSourceResult.isEmpty());
    Stream<String> linesResult = actualToCharSourceResult.lines();
    assertTrue(linesResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link UnicodeBom#toReader(InputStream)}.
   *
   * <p>Method under test: {@link UnicodeBom#toReader(InputStream)}
   */
  @Test
  @DisplayName("Test toReader(InputStream)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Reader UnicodeBom.toReader(InputStream)"})
  void testToReader() throws IOException {
    // Arrange
    ByteArrayInputStream inputStream =
        new ByteArrayInputStream(new byte[] {-17, 'X', 'A', 'X', 'A', 'X', 'A', 'X'});

    // Act
    Reader actualToReaderResult = UnicodeBom.toReader(inputStream);

    // Assert
    byte[] byteArray = new byte[5];
    assertEquals(5, inputStream.read(byteArray));
    assertTrue(actualToReaderResult.ready());
    assertArrayEquals("XAXAX".getBytes("UTF-8"), byteArray);
  }

  /**
   * Test {@link UnicodeBom#toReader(InputStream)}.
   *
   * <ul>
   *   <li>Then {@link ByteArrayInputStream#ByteArrayInputStream(byte[])} with array of {@code byte}
   *       with minus one and {@code X} read is five.
   * </ul>
   *
   * <p>Method under test: {@link UnicodeBom#toReader(InputStream)}
   */
  @Test
  @DisplayName(
      "Test toReader(InputStream); then ByteArrayInputStream(byte[]) with array of byte with minus one and 'X' read is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Reader UnicodeBom.toReader(InputStream)"})
  void testToReader_thenByteArrayInputStreamWithArrayOfByteWithMinusOneAndXReadIsFive()
      throws IOException {
    // Arrange
    ByteArrayInputStream inputStream =
        new ByteArrayInputStream(new byte[] {-1, 'X', 'A', 'X', 'A', 'X', 'A', 'X'});

    // Act
    Reader actualToReaderResult = UnicodeBom.toReader(inputStream);

    // Assert
    byte[] byteArray = new byte[5];
    assertEquals(5, inputStream.read(byteArray));
    assertTrue(actualToReaderResult.ready());
    assertArrayEquals("XAXAX".getBytes("UTF-8"), byteArray);
  }

  /**
   * Test {@link UnicodeBom#toReader(InputStream)}.
   *
   * <ul>
   *   <li>Then {@link ByteArrayInputStream#ByteArrayInputStream(byte[])} with array of {@code byte}
   *       with minus two and {@code X} read is five.
   * </ul>
   *
   * <p>Method under test: {@link UnicodeBom#toReader(InputStream)}
   */
  @Test
  @DisplayName(
      "Test toReader(InputStream); then ByteArrayInputStream(byte[]) with array of byte with minus two and 'X' read is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Reader UnicodeBom.toReader(InputStream)"})
  void testToReader_thenByteArrayInputStreamWithArrayOfByteWithMinusTwoAndXReadIsFive()
      throws IOException {
    // Arrange
    ByteArrayInputStream inputStream =
        new ByteArrayInputStream(new byte[] {-2, 'X', 'A', 'X', 'A', 'X', 'A', 'X'});

    // Act
    Reader actualToReaderResult = UnicodeBom.toReader(inputStream);

    // Assert
    byte[] byteArray = new byte[5];
    assertEquals(5, inputStream.read(byteArray));
    assertTrue(actualToReaderResult.ready());
    assertArrayEquals("XAXAX".getBytes("UTF-8"), byteArray);
  }

  /**
   * Test {@link UnicodeBom#toReader(InputStream)}.
   *
   * <ul>
   *   <li>Then {@link ByteArrayInputStream#ByteArrayInputStream(byte[])} with {@code AXAXAXAX}
   *       Bytes is {@code UTF-8} read is five.
   * </ul>
   *
   * <p>Method under test: {@link UnicodeBom#toReader(InputStream)}
   */
  @Test
  @DisplayName(
      "Test toReader(InputStream); then ByteArrayInputStream(byte[]) with 'AXAXAXAX' Bytes is 'UTF-8' read is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Reader UnicodeBom.toReader(InputStream)"})
  void testToReader_thenByteArrayInputStreamWithAxaxaxaxBytesIsUtf8ReadIsFive() throws IOException {
    // Arrange
    ByteArrayInputStream inputStream = new ByteArrayInputStream("AXAXAXAX".getBytes("UTF-8"));

    // Act
    Reader actualToReaderResult = UnicodeBom.toReader(inputStream);

    // Assert
    byte[] byteArray = new byte[5];
    assertEquals(5, inputStream.read(byteArray));
    assertTrue(actualToReaderResult.ready());
    assertArrayEquals("XAXAX".getBytes("UTF-8"), byteArray);
  }

  /**
   * Test {@link UnicodeBom#toReader(InputStream)}.
   *
   * <ul>
   *   <li>Then {@link ByteArrayInputStream#ByteArrayInputStream(byte[])} with empty array of {@code
   *       byte} read is minus one.
   * </ul>
   *
   * <p>Method under test: {@link UnicodeBom#toReader(InputStream)}
   */
  @Test
  @DisplayName(
      "Test toReader(InputStream); then ByteArrayInputStream(byte[]) with empty array of byte read is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Reader UnicodeBom.toReader(InputStream)"})
  void testToReader_thenByteArrayInputStreamWithEmptyArrayOfByteReadIsMinusOne()
      throws IOException {
    // Arrange
    ByteArrayInputStream inputStream = new ByteArrayInputStream(new byte[] {});

    // Act
    Reader actualToReaderResult = UnicodeBom.toReader(inputStream);

    // Assert
    int actualReadResult = inputStream.read(new byte[] {});
    assertEquals(-1, actualReadResult);
    assertFalse(actualToReaderResult.ready());
  }

  /**
   * Test UnicodeBomCharSource {@link UnicodeBomCharSource#equals(Object)}, and {@link
   * UnicodeBomCharSource#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UnicodeBomCharSource#equals(Object)}
   *   <li>{@link UnicodeBomCharSource#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName(
      "Test UnicodeBomCharSource equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UnicodeBomCharSource.equals(Object)",
    "int UnicodeBomCharSource.hashCode()"
  })
  void testUnicodeBomCharSourceEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UnicodeBomCharSource unicodeBomCharSource = new UnicodeBomCharSource(ArrayByteSource.EMPTY);
    UnicodeBomCharSource unicodeBomCharSource2 = new UnicodeBomCharSource(ArrayByteSource.EMPTY);

    // Act and Assert
    assertEquals(unicodeBomCharSource, unicodeBomCharSource2);
    assertEquals(unicodeBomCharSource.hashCode(), unicodeBomCharSource2.hashCode());
  }

  /**
   * Test UnicodeBomCharSource {@link UnicodeBomCharSource#equals(Object)}, and {@link
   * UnicodeBomCharSource#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UnicodeBomCharSource#equals(Object)}
   *   <li>{@link UnicodeBomCharSource#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName(
      "Test UnicodeBomCharSource equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UnicodeBomCharSource.equals(Object)",
    "int UnicodeBomCharSource.hashCode()"
  })
  void testUnicodeBomCharSourceEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UnicodeBomCharSource unicodeBomCharSource = new UnicodeBomCharSource(ArrayByteSource.EMPTY);

    // Act and Assert
    assertEquals(unicodeBomCharSource, unicodeBomCharSource);
    int expectedHashCodeResult = unicodeBomCharSource.hashCode();
    assertEquals(expectedHashCodeResult, unicodeBomCharSource.hashCode());
  }

  /**
   * Test UnicodeBomCharSource {@link UnicodeBomCharSource#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UnicodeBomCharSource#equals(Object)}
   */
  @Test
  @DisplayName(
      "Test UnicodeBomCharSource equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UnicodeBomCharSource.equals(Object)",
    "int UnicodeBomCharSource.hashCode()"
  })
  void testUnicodeBomCharSourceEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UnicodeBomCharSource(ArrayByteSource.EMPTY), null);
  }

  /**
   * Test UnicodeBomCharSource {@link UnicodeBomCharSource#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UnicodeBomCharSource#equals(Object)}
   */
  @Test
  @DisplayName(
      "Test UnicodeBomCharSource equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UnicodeBomCharSource.equals(Object)",
    "int UnicodeBomCharSource.hashCode()"
  })
  void testUnicodeBomCharSourceEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new UnicodeBomCharSource(ArrayByteSource.EMPTY), "Different type to UnicodeBomCharSource");
  }

  /**
   * Test UnicodeBomCharSource {@link UnicodeBomCharSource#getFileName()}.
   *
   * <p>Method under test: {@link UnicodeBomCharSource#getFileName()}
   */
  @Test
  @DisplayName("Test UnicodeBomCharSource getFileName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Optional UnicodeBomCharSource.getFileName()"})
  void testUnicodeBomCharSourceGetFileName() {
    // Arrange, Act and Assert
    assertFalse(new UnicodeBomCharSource(ArrayByteSource.EMPTY).getFileName().isPresent());
  }

  /**
   * Test UnicodeBomCharSource {@link UnicodeBomCharSource#metaBean()}.
   *
   * <p>Method under test: {@link UnicodeBomCharSource#metaBean()}
   */
  @Test
  @DisplayName("Test UnicodeBomCharSource metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaBean UnicodeBomCharSource.metaBean()"})
  void testUnicodeBomCharSourceMetaBean() {
    // Arrange and Act
    MetaBean actualMetaBeanResult = new UnicodeBomCharSource(ArrayByteSource.EMPTY).metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof Meta);
    assertTrue(actualMetaBeanResult.isBuildable());
  }

  /**
   * Test UnicodeBomCharSource {@link UnicodeBomCharSource#UnicodeBomCharSource(BeanByteSource)}.
   *
   * <ul>
   *   <li>Then return readFirstLine is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link UnicodeBomCharSource#UnicodeBomCharSource(BeanByteSource)}
   */
  @Test
  @DisplayName(
      "Test UnicodeBomCharSource new UnicodeBomCharSource(BeanByteSource); then return readFirstLine is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void UnicodeBomCharSource.<init>(BeanByteSource)"})
  void testUnicodeBomCharSourceNewUnicodeBomCharSource_thenReturnReadFirstLineIsNull() {
    // Arrange and Act
    UnicodeBomCharSource actualUnicodeBomCharSource =
        new UnicodeBomCharSource(ArrayByteSource.EMPTY);

    // Assert
    assertNull(actualUnicodeBomCharSource.readFirstLine());
    assertEquals(0L, actualUnicodeBomCharSource.length());
    assertFalse(actualUnicodeBomCharSource.getFileName().isPresent());
    assertTrue(actualUnicodeBomCharSource.isEmpty());
    assertTrue(actualUnicodeBomCharSource.readLines().isEmpty());
  }

  /**
   * Test UnicodeBomCharSource {@link UnicodeBomCharSource#openStream()}.
   *
   * <ul>
   *   <li>Then return not ready.
   * </ul>
   *
   * <p>Method under test: {@link UnicodeBomCharSource#openStream()}
   */
  @Test
  @DisplayName("Test UnicodeBomCharSource openStream(); then return not ready")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Reader UnicodeBomCharSource.openStream()"})
  void testUnicodeBomCharSourceOpenStream_thenReturnNotReady() throws IOException {
    // Arrange, Act and Assert
    assertFalse(new UnicodeBomCharSource(ArrayByteSource.EMPTY).openStream().ready());
  }

  /**
   * Test UnicodeBomCharSource {@link UnicodeBomCharSource#openStream()}.
   *
   * <ul>
   *   <li>Then return ready.
   * </ul>
   *
   * <p>Method under test: {@link UnicodeBomCharSource#openStream()}
   */
  @Test
  @DisplayName("Test UnicodeBomCharSource openStream(); then return ready")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Reader UnicodeBomCharSource.openStream()"})
  void testUnicodeBomCharSourceOpenStream_thenReturnReady() throws IOException {
    // Arrange, Act and Assert
    assertTrue(new UnicodeBomCharSource(ArrayByteSource.fromBase64("Base64")).openStream().ready());
  }

  /**
   * Test UnicodeBomCharSource {@link UnicodeBomCharSource#toString()}.
   *
   * <p>Method under test: {@link UnicodeBomCharSource#toString()}
   */
  @Test
  @DisplayName("Test UnicodeBomCharSource toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String UnicodeBomCharSource.toString()"})
  void testUnicodeBomCharSourceToString() {
    // Arrange, Act and Assert
    assertEquals(
        "UnicodeBom.toCharSource(ArrayByteSource[0 bytes])",
        new UnicodeBomCharSource(ArrayByteSource.EMPTY).toString());
  }
}
