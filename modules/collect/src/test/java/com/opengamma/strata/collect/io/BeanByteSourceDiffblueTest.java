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
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hasher;
import com.opengamma.strata.collect.io.BeanByteSource.AsBeanCharSource;
import com.opengamma.strata.collect.io.BeanByteSource.AsBeanCharSource.Meta;
import com.opengamma.strata.collect.io.UnicodeBom.UnicodeBomCharSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
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

class BeanByteSourceDiffblueTest {
  /**
   * Test AsBeanCharSource {@link AsBeanCharSource#asByteSource(Charset)}.
   *
   * <ul>
   *   <li>When forName {@code UTF-8}.
   *   <li>Then return {@link ArrayByteSource#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link AsBeanCharSource#asByteSource(Charset)}
   */
  @Test
  @DisplayName(
      "Test AsBeanCharSource asByteSource(Charset); when forName 'UTF-8'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BeanByteSource AsBeanCharSource.asByteSource(Charset)"})
  void testAsBeanCharSourceAsByteSource_whenForNameUtf8_thenReturnEmpty() {
    // Arrange
    AsBeanCharSource asBeanCharSource =
        new AsBeanCharSource(ArrayByteSource.EMPTY, Charset.forName("UTF-8"));

    // Act
    BeanByteSource actualAsByteSourceResult =
        asBeanCharSource.asByteSource(Charset.forName("UTF-8"));

    // Assert
    assertSame(((ArrayByteSource) actualAsByteSourceResult).EMPTY, actualAsByteSourceResult);
  }

  /**
   * Test AsBeanCharSource {@link AsBeanCharSource#equals(Object)}, and {@link
   * AsBeanCharSource#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AsBeanCharSource#equals(Object)}
   *   <li>{@link AsBeanCharSource#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName(
      "Test AsBeanCharSource equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AsBeanCharSource.equals(Object)", "int AsBeanCharSource.hashCode()"})
  void testAsBeanCharSourceEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AsBeanCharSource asBeanCharSource =
        new AsBeanCharSource(ArrayByteSource.EMPTY, Charset.forName("UTF-8"));
    AsBeanCharSource asBeanCharSource2 =
        new AsBeanCharSource(ArrayByteSource.EMPTY, Charset.forName("UTF-8"));

    // Act and Assert
    assertEquals(asBeanCharSource, asBeanCharSource2);
    assertEquals(asBeanCharSource.hashCode(), asBeanCharSource2.hashCode());
  }

  /**
   * Test AsBeanCharSource {@link AsBeanCharSource#equals(Object)}, and {@link
   * AsBeanCharSource#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AsBeanCharSource#equals(Object)}
   *   <li>{@link AsBeanCharSource#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName(
      "Test AsBeanCharSource equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AsBeanCharSource.equals(Object)", "int AsBeanCharSource.hashCode()"})
  void testAsBeanCharSourceEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AsBeanCharSource asBeanCharSource =
        new AsBeanCharSource(ArrayByteSource.EMPTY, Charset.forName("UTF-8"));

    // Act and Assert
    assertEquals(asBeanCharSource, asBeanCharSource);
    int expectedHashCodeResult = asBeanCharSource.hashCode();
    assertEquals(expectedHashCodeResult, asBeanCharSource.hashCode());
  }

  /**
   * Test AsBeanCharSource {@link AsBeanCharSource#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AsBeanCharSource#equals(Object)}
   */
  @Test
  @DisplayName(
      "Test AsBeanCharSource equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AsBeanCharSource.equals(Object)", "int AsBeanCharSource.hashCode()"})
  void testAsBeanCharSourceEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AsBeanCharSource(ArrayByteSource.EMPTY, Charset.forName("UTF-8")), 1);
  }

  /**
   * Test AsBeanCharSource {@link AsBeanCharSource#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AsBeanCharSource#equals(Object)}
   */
  @Test
  @DisplayName(
      "Test AsBeanCharSource equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AsBeanCharSource.equals(Object)", "int AsBeanCharSource.hashCode()"})
  void testAsBeanCharSourceEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ArrayByteSource underlying = ArrayByteSource.fromBase64("Base64");
    AsBeanCharSource asBeanCharSource = new AsBeanCharSource(underlying, Charset.forName("UTF-8"));

    // Act and Assert
    assertNotEquals(
        asBeanCharSource, new AsBeanCharSource(ArrayByteSource.EMPTY, Charset.forName("UTF-8")));
  }

  /**
   * Test AsBeanCharSource {@link AsBeanCharSource#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AsBeanCharSource#equals(Object)}
   */
  @Test
  @DisplayName("Test AsBeanCharSource equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AsBeanCharSource.equals(Object)", "int AsBeanCharSource.hashCode()"})
  void testAsBeanCharSourceEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AsBeanCharSource(ArrayByteSource.EMPTY, Charset.forName("UTF-8")), null);
  }

  /**
   * Test AsBeanCharSource {@link AsBeanCharSource#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AsBeanCharSource#equals(Object)}
   */
  @Test
  @DisplayName(
      "Test AsBeanCharSource equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AsBeanCharSource.equals(Object)", "int AsBeanCharSource.hashCode()"})
  void testAsBeanCharSourceEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new AsBeanCharSource(ArrayByteSource.EMPTY, Charset.forName("UTF-8")),
        "Different type to AsBeanCharSource");
  }

  /**
   * Test AsBeanCharSource {@link AsBeanCharSource#getFileName()}.
   *
   * <ul>
   *   <li>Then return {@link Optional#get()} is {@code test.txt}.
   * </ul>
   *
   * <p>Method under test: {@link AsBeanCharSource#getFileName()}
   */
  @Test
  @DisplayName("Test AsBeanCharSource getFileName(); then return get() is 'test.txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional AsBeanCharSource.getFileName()"})
  void testAsBeanCharSourceGetFileName_thenReturnGetIsTestTxt() {
    // Arrange
    FileByteSource underlying =
        FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());
    AsBeanCharSource asBeanCharSource = new AsBeanCharSource(underlying, Charset.forName("UTF-8"));

    // Act
    Optional<String> actualFileName = asBeanCharSource.getFileName();

    // Assert
    assertEquals("test.txt", actualFileName.get());
    assertTrue(actualFileName.isPresent());
  }

  /**
   * Test AsBeanCharSource {@link AsBeanCharSource#getFileName()}.
   *
   * <ul>
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link AsBeanCharSource#getFileName()}
   */
  @Test
  @DisplayName("Test AsBeanCharSource getFileName(); then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional AsBeanCharSource.getFileName()"})
  void testAsBeanCharSourceGetFileName_thenReturnNotPresent() {
    // Arrange
    AsBeanCharSource asBeanCharSource =
        new AsBeanCharSource(ArrayByteSource.EMPTY, Charset.forName("UTF-8"));

    // Act and Assert
    assertFalse(asBeanCharSource.getFileName().isPresent());
  }

  /**
   * Test AsBeanCharSource {@link AsBeanCharSource#metaBean()}.
   *
   * <p>Method under test: {@link AsBeanCharSource#metaBean()}
   */
  @Test
  @DisplayName("Test AsBeanCharSource metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaBean AsBeanCharSource.metaBean()"})
  void testAsBeanCharSourceMetaBean() {
    // Arrange
    AsBeanCharSource asBeanCharSource =
        new AsBeanCharSource(ArrayByteSource.EMPTY, Charset.forName("UTF-8"));

    // Act
    MetaBean actualMetaBeanResult = asBeanCharSource.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof Meta);
    assertTrue(actualMetaBeanResult.isBuildable());
  }

  /**
   * Test AsBeanCharSource {@link AsBeanCharSource#AsBeanCharSource(BeanByteSource, Charset)}.
   *
   * <ul>
   *   <li>When {@link ArrayByteSource#EMPTY}.
   *   <li>Then return readFirstLine is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AsBeanCharSource#AsBeanCharSource(BeanByteSource, Charset)}
   */
  @Test
  @DisplayName(
      "Test AsBeanCharSource new AsBeanCharSource(BeanByteSource, Charset); when EMPTY; then return readFirstLine is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AsBeanCharSource.<init>(BeanByteSource, Charset)"})
  void testAsBeanCharSourceNewAsBeanCharSource_whenEmpty_thenReturnReadFirstLineIsNull() {
    // Arrange and Act
    AsBeanCharSource actualAsBeanCharSource =
        new AsBeanCharSource(ArrayByteSource.EMPTY, Charset.forName("UTF-8"));

    // Assert
    assertNull(actualAsBeanCharSource.readFirstLine());
    assertEquals(0L, actualAsBeanCharSource.length());
    assertFalse(actualAsBeanCharSource.getFileName().isPresent());
    assertTrue(actualAsBeanCharSource.isEmpty());
    assertTrue(actualAsBeanCharSource.readLines().isEmpty());
  }

  /**
   * Test AsBeanCharSource {@link AsBeanCharSource#openStream()}.
   *
   * <ul>
   *   <li>Then calls {@link BeanByteSource#openStream()}.
   * </ul>
   *
   * <p>Method under test: {@link AsBeanCharSource#openStream()}
   */
  @Test
  @DisplayName("Test AsBeanCharSource openStream(); then calls openStream()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.io.Reader AsBeanCharSource.openStream()"})
  void testAsBeanCharSourceOpenStream_thenCallsOpenStream() throws IOException {
    // Arrange
    BeanByteSource underlying = mock(BeanByteSource.class);
    when(underlying.openStream())
        .thenReturn(new ByteArrayInputStream("AXAXAXAX".getBytes("UTF-8")));
    AsBeanCharSource asBeanCharSource = new AsBeanCharSource(underlying, Charset.forName("UTF-8"));

    // Act
    asBeanCharSource.openStream();

    // Assert
    verify(underlying).openStream();
  }

  /**
   * Test AsBeanCharSource {@link AsBeanCharSource#read()}.
   *
   * <p>Method under test: {@link AsBeanCharSource#read()}
   */
  @Test
  @DisplayName("Test AsBeanCharSource read()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String AsBeanCharSource.read()"})
  void testAsBeanCharSourceRead() {
    // Arrange
    AsBeanCharSource asBeanCharSource =
        new AsBeanCharSource(ArrayByteSource.EMPTY, Charset.forName("UTF-8"));

    // Act and Assert
    assertEquals("", asBeanCharSource.read());
  }

  /**
   * Test AsBeanCharSource {@link AsBeanCharSource#toString()}.
   *
   * <p>Method under test: {@link AsBeanCharSource#toString()}
   */
  @Test
  @DisplayName("Test AsBeanCharSource toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String AsBeanCharSource.toString()"})
  void testAsBeanCharSourceToString() {
    // Arrange
    AsBeanCharSource asBeanCharSource =
        new AsBeanCharSource(ArrayByteSource.EMPTY, Charset.forName("UTF-8"));

    // Act and Assert
    assertEquals("ArrayByteSource[0 bytes].asCharSource(UTF-8)", asBeanCharSource.toString());
  }

  /**
   * Test {@link BeanByteSource#getFileName()}.
   *
   * <p>Method under test: {@link BeanByteSource#getFileName()}
   */
  @Test
  @DisplayName("Test getFileName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional BeanByteSource.getFileName()"})
  void testGetFileName() {
    // Arrange, Act and Assert
    assertFalse(ArrayByteSource.EMPTY.getFileName().isPresent());
  }

  /**
   * Test {@link BeanByteSource#getFileNameOrThrow()}.
   *
   * <p>Method under test: {@link BeanByteSource#getFileNameOrThrow()}
   */
  @Test
  @DisplayName("Test getFileNameOrThrow()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BeanByteSource.getFileNameOrThrow()"})
  void testGetFileNameOrThrow() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArrayByteSource.EMPTY.getFileNameOrThrow());
  }

  /**
   * Test {@link BeanByteSource#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link ArrayByteSource#EMPTY}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link BeanByteSource#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given EMPTY; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BeanByteSource.isEmpty()"})
  void testIsEmpty_givenEmpty_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(ArrayByteSource.EMPTY.isEmpty());
  }

  /**
   * Test {@link BeanByteSource#isEmpty()}.
   *
   * <ul>
   *   <li>Given fromBase64 {@code Base64}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link BeanByteSource#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given fromBase64 'Base64'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BeanByteSource.isEmpty()"})
  void testIsEmpty_givenFromBase64Base64_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(ArrayByteSource.fromBase64("Base64").isEmpty());
  }

  /**
   * Test {@link BeanByteSource#isEmpty()}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link BeanByteSource#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BeanByteSource.isEmpty()"})
  void testIsEmpty_thenThrowUncheckedIOException() {
    // Arrange, Act and Assert
    assertThrows(
        UncheckedIOException.class,
        () ->
            FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile())
                .isEmpty());
  }

  /**
   * Test {@link BeanByteSource#size()}.
   *
   * <ul>
   *   <li>Given {@link ArrayByteSource#EMPTY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BeanByteSource#size()}
   */
  @Test
  @DisplayName("Test size(); given EMPTY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long BeanByteSource.size()"})
  void testSize_givenEmpty_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0L, ArrayByteSource.EMPTY.size());
  }

  /**
   * Test {@link BeanByteSource#size()}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link BeanByteSource#size()}
   */
  @Test
  @DisplayName("Test size(); then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long BeanByteSource.size()"})
  void testSize_thenThrowUncheckedIOException() {
    // Arrange, Act and Assert
    assertThrows(
        UncheckedIOException.class,
        () ->
            UriByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri())
                .size());
  }

  /**
   * Test {@link BeanByteSource#read()}.
   *
   * <p>Method under test: {@link BeanByteSource#read()}
   */
  @Test
  @DisplayName("Test read()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] BeanByteSource.read()"})
  void testRead() {
    // Arrange, Act and Assert
    assertThrows(
        UncheckedIOException.class,
        () ->
            FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile())
                .read());
  }

  /**
   * Test {@link BeanByteSource#readUtf8()}.
   *
   * <p>Method under test: {@link BeanByteSource#readUtf8()}
   */
  @Test
  @DisplayName("Test readUtf8()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BeanByteSource.readUtf8()"})
  void testReadUtf8() {
    // Arrange, Act and Assert
    assertThrows(
        UncheckedIOException.class,
        () ->
            FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile())
                .readUtf8());
  }

  /**
   * Test {@link BeanByteSource#readUtf8UsingBom()}.
   *
   * <p>Method under test: {@link BeanByteSource#readUtf8UsingBom()}
   */
  @Test
  @DisplayName("Test readUtf8UsingBom()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BeanByteSource.readUtf8UsingBom()"})
  void testReadUtf8UsingBom() {
    // Arrange, Act and Assert
    assertThrows(
        UncheckedIOException.class,
        () ->
            FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile())
                .readUtf8UsingBom());
  }

  /**
   * Test {@link BeanByteSource#asCharSource(Charset)}.
   *
   * <ul>
   *   <li>Given {@link ArrayByteSource#EMPTY}.
   *   <li>When forName {@code UTF-8}.
   *   <li>Then return {@link StringCharSource}.
   * </ul>
   *
   * <p>Method under test: {@link BeanByteSource#asCharSource(Charset)}
   */
  @Test
  @DisplayName(
      "Test asCharSource(Charset); given EMPTY; when forName 'UTF-8'; then return StringCharSource")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BeanCharSource BeanByteSource.asCharSource(Charset)"})
  void testAsCharSource_givenEmpty_whenForNameUtf8_thenReturnStringCharSource() {
    // Arrange and Act
    StringCharSource actualAsCharSourceResult =
        ArrayByteSource.EMPTY.asCharSource(Charset.forName("UTF-8"));

    // Assert
    assertTrue(actualAsCharSourceResult instanceof StringCharSource);
    assertEquals(((StringCharSource) actualAsCharSourceResult).EMPTY, actualAsCharSourceResult);
  }

  /**
   * Test {@link BeanByteSource#asCharSource(Charset)}.
   *
   * <ul>
   *   <li>Then return FileNameOrThrow is {@code test.txt}.
   * </ul>
   *
   * <p>Method under test: {@link BeanByteSource#asCharSource(Charset)}
   */
  @Test
  @DisplayName("Test asCharSource(Charset); then return FileNameOrThrow is 'test.txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BeanCharSource BeanByteSource.asCharSource(Charset)"})
  void testAsCharSource_thenReturnFileNameOrThrowIsTestTxt() {
    // Arrange
    FileByteSource ofResult =
        FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());

    // Act
    BeanCharSource actualAsCharSourceResult = ofResult.asCharSource(Charset.forName("UTF-8"));

    // Assert
    assertTrue(actualAsCharSourceResult instanceof AsBeanCharSource);
    assertEquals("test.txt", actualAsCharSourceResult.getFileNameOrThrow());
    Optional<String> fileName = actualAsCharSourceResult.getFileName();
    assertEquals("test.txt", fileName.get());
    assertTrue(fileName.isPresent());
  }

  /**
   * Test {@link BeanByteSource#asCharSource(Charset)}.
   *
   * <ul>
   *   <li>Then return FileNameOrThrow is {@code underlying}.
   * </ul>
   *
   * <p>Method under test: {@link BeanByteSource#asCharSource(Charset)}
   */
  @Test
  @DisplayName("Test asCharSource(Charset); then return FileNameOrThrow is 'underlying'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BeanCharSource BeanByteSource.asCharSource(Charset)"})
  void testAsCharSource_thenReturnFileNameOrThrowIsUnderlying() {
    // Arrange
    FileByteSource ofResult =
        FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "underlying").toFile());

    // Act
    BeanCharSource actualAsCharSourceResult = ofResult.asCharSource(Charset.forName("UTF-8"));

    // Assert
    assertTrue(actualAsCharSourceResult instanceof AsBeanCharSource);
    assertEquals("underlying", actualAsCharSourceResult.getFileNameOrThrow());
    Optional<String> fileName = actualAsCharSourceResult.getFileName();
    assertEquals("underlying", fileName.get());
    assertTrue(fileName.isPresent());
  }

  /**
   * Test {@link BeanByteSource#asCharSourceUtf8()}.
   *
   * <ul>
   *   <li>Given {@link ArrayByteSource#EMPTY}.
   *   <li>Then return {@link StringCharSource}.
   * </ul>
   *
   * <p>Method under test: {@link BeanByteSource#asCharSourceUtf8()}
   */
  @Test
  @DisplayName("Test asCharSourceUtf8(); given EMPTY; then return StringCharSource")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BeanCharSource BeanByteSource.asCharSourceUtf8()"})
  void testAsCharSourceUtf8_givenEmpty_thenReturnStringCharSource() {
    // Arrange and Act
    StringCharSource actualAsCharSourceUtf8Result = ArrayByteSource.EMPTY.asCharSourceUtf8();

    // Assert
    assertTrue(actualAsCharSourceUtf8Result instanceof StringCharSource);
    assertEquals(
        ((StringCharSource) actualAsCharSourceUtf8Result).EMPTY, actualAsCharSourceUtf8Result);
  }

  /**
   * Test {@link BeanByteSource#asCharSourceUtf8()}.
   *
   * <ul>
   *   <li>Then return {@link AsBeanCharSource}.
   * </ul>
   *
   * <p>Method under test: {@link BeanByteSource#asCharSourceUtf8()}
   */
  @Test
  @DisplayName("Test asCharSourceUtf8(); then return AsBeanCharSource")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BeanCharSource BeanByteSource.asCharSourceUtf8()"})
  void testAsCharSourceUtf8_thenReturnAsBeanCharSource() {
    // Arrange and Act
    BeanCharSource actualAsCharSourceUtf8Result =
        FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile())
            .asCharSourceUtf8();

    // Assert
    assertTrue(actualAsCharSourceUtf8Result instanceof AsBeanCharSource);
    assertEquals("test.txt", actualAsCharSourceUtf8Result.getFileNameOrThrow());
    Optional<String> fileName = actualAsCharSourceUtf8Result.getFileName();
    assertEquals("test.txt", fileName.get());
    assertTrue(fileName.isPresent());
  }

  /**
   * Test {@link BeanByteSource#asCharSourceUtf8UsingBom()}.
   *
   * <p>Method under test: {@link BeanByteSource#asCharSourceUtf8UsingBom()}
   */
  @Test
  @DisplayName("Test asCharSourceUtf8UsingBom()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BeanCharSource BeanByteSource.asCharSourceUtf8UsingBom()"})
  void testAsCharSourceUtf8UsingBom() {
    // Arrange and Act
    StringCharSource actualAsCharSourceUtf8UsingBomResult =
        ArrayByteSource.fromBase64("Base64").asCharSourceUtf8UsingBom();

    // Assert
    assertTrue(actualAsCharSourceUtf8UsingBomResult instanceof StringCharSource);
    assertEquals("\u0005�\u001e�", actualAsCharSourceUtf8UsingBomResult.readFirstLine());
    ImmutableList<String> readLinesResult = actualAsCharSourceUtf8UsingBomResult.readLines();
    assertEquals(1, readLinesResult.size());
    assertEquals("\u0005�\u001e�", readLinesResult.get(0));
    assertEquals(4L, actualAsCharSourceUtf8UsingBomResult.length());
    assertFalse(actualAsCharSourceUtf8UsingBomResult.isEmpty());
  }

  /**
   * Test {@link BeanByteSource#asCharSourceUtf8UsingBom()}.
   *
   * <ul>
   *   <li>Given {@link ArrayByteSource#EMPTY}.
   *   <li>Then return {@link StringCharSource#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link BeanByteSource#asCharSourceUtf8UsingBom()}
   */
  @Test
  @DisplayName("Test asCharSourceUtf8UsingBom(); given EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BeanCharSource BeanByteSource.asCharSourceUtf8UsingBom()"})
  void testAsCharSourceUtf8UsingBom_givenEmpty_thenReturnEmpty() {
    // Arrange and Act
    StringCharSource actualAsCharSourceUtf8UsingBomResult =
        ArrayByteSource.EMPTY.asCharSourceUtf8UsingBom();

    // Assert
    assertTrue(actualAsCharSourceUtf8UsingBomResult instanceof StringCharSource);
    assertEquals(
        ((StringCharSource) actualAsCharSourceUtf8UsingBomResult).EMPTY,
        actualAsCharSourceUtf8UsingBomResult);
  }

  /**
   * Test {@link BeanByteSource#asCharSourceUtf8UsingBom()}.
   *
   * <ul>
   *   <li>Then return {@link UnicodeBomCharSource}.
   * </ul>
   *
   * <p>Method under test: {@link BeanByteSource#asCharSourceUtf8UsingBom()}
   */
  @Test
  @DisplayName("Test asCharSourceUtf8UsingBom(); then return UnicodeBomCharSource")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BeanCharSource BeanByteSource.asCharSourceUtf8UsingBom()"})
  void testAsCharSourceUtf8UsingBom_thenReturnUnicodeBomCharSource() {
    // Arrange and Act
    BeanCharSource actualAsCharSourceUtf8UsingBomResult =
        FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile())
            .asCharSourceUtf8UsingBom();

    // Assert
    assertTrue(actualAsCharSourceUtf8UsingBomResult instanceof UnicodeBomCharSource);
    assertEquals("test.txt", actualAsCharSourceUtf8UsingBomResult.getFileNameOrThrow());
    Optional<String> fileName = actualAsCharSourceUtf8UsingBomResult.getFileName();
    assertEquals("test.txt", fileName.get());
    assertTrue(fileName.isPresent());
  }

  /**
   * Test {@link BeanByteSource#load()}.
   *
   * <p>Method under test: {@link BeanByteSource#load()}
   */
  @Test
  @DisplayName("Test load()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource BeanByteSource.load()"})
  void testLoad() {
    // Arrange, Act and Assert
    assertSame(ArrayByteSource.EMPTY, ArrayByteSource.EMPTY.load());
  }

  /**
   * Test {@link BeanByteSource#hash(HashFunction)}.
   *
   * <ul>
   *   <li>Given {@link HashCode}.
   *   <li>Then calls {@link HashFunction#hashBytes(byte[])}.
   * </ul>
   *
   * <p>Method under test: {@link BeanByteSource#hash(HashFunction)}
   */
  @Test
  @DisplayName("Test hash(HashFunction); given HashCode; then calls hashBytes(byte[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HashCode BeanByteSource.hash(HashFunction)"})
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
   * Test {@link BeanByteSource#hash(HashFunction)}.
   *
   * <ul>
   *   <li>Given {@link Hasher}.
   *   <li>When {@link HashFunction} {@link HashFunction#newHasher()} return {@link Hasher}.
   * </ul>
   *
   * <p>Method under test: {@link BeanByteSource#hash(HashFunction)}
   */
  @Test
  @DisplayName("Test hash(HashFunction); given Hasher; when HashFunction newHasher() return Hasher")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HashCode BeanByteSource.hash(HashFunction)"})
  void testHash_givenHasher_whenHashFunctionNewHasherReturnHasher() {
    // Arrange
    FileByteSource ofResult =
        FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());

    HashFunction hashFunction = mock(HashFunction.class);
    when(hashFunction.newHasher()).thenReturn(mock(Hasher.class));

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> ofResult.hash(hashFunction));
    verify(hashFunction).newHasher();
  }

  /**
   * Test {@link BeanByteSource#hash(HashFunction)}.
   *
   * <ul>
   *   <li>When {@link HashFunction} {@link HashFunction#newHasher()} throw {@link
   *       UncheckedIOException#UncheckedIOException(IOException)} with {@link
   *       IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link BeanByteSource#hash(HashFunction)}
   */
  @Test
  @DisplayName(
      "Test hash(HashFunction); when HashFunction newHasher() throw UncheckedIOException(IOException) with IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HashCode BeanByteSource.hash(HashFunction)"})
  void testHash_whenHashFunctionNewHasherThrowUncheckedIOExceptionWithIOException() {
    // Arrange
    FileByteSource ofResult =
        FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());

    HashFunction hashFunction = mock(HashFunction.class);
    when(hashFunction.newHasher()).thenThrow(new UncheckedIOException(new IOException()));

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> ofResult.hash(hashFunction));
    verify(hashFunction).newHasher();
  }

  /**
   * Test {@link BeanByteSource#toHash(HashFunction)}.
   *
   * <ul>
   *   <li>Then return readUtf8 is {@code AXAXAXAX}.
   * </ul>
   *
   * <p>Method under test: {@link BeanByteSource#toHash(HashFunction)}
   */
  @Test
  @DisplayName("Test toHash(HashFunction); then return readUtf8 is 'AXAXAXAX'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource BeanByteSource.toHash(HashFunction)"})
  void testToHash_thenReturnReadUtf8IsAxaxaxax() throws UnsupportedEncodingException {
    // Arrange
    HashCode hashCode = mock(HashCode.class);
    when(hashCode.asBytes()).thenReturn("AXAXAXAX".getBytes("UTF-8"));

    HashFunction hashFunction = mock(HashFunction.class);
    when(hashFunction.hashBytes(Mockito.<byte[]>any())).thenReturn(hashCode);

    // Act
    ArrayByteSource actualToHashResult = ArrayByteSource.EMPTY.toHash(hashFunction);

    // Assert
    verify(hashCode).asBytes();
    verify(hashFunction).hashBytes(isA(byte[].class));
    assertEquals("AXAXAXAX", actualToHashResult.readUtf8());
    assertEquals("AXAXAXAX", actualToHashResult.readUtf8UsingBom());
    ArrayByteSource toMd5Result = actualToHashResult.toMd5();
    assertEquals("�\u001f�'?M\u0012��2bԿH��", toMd5Result.readUtf8());
    assertEquals("�\u001f�'?M\u0012��2bԿH��", toMd5Result.readUtf8UsingBom());
    assertEquals(16L, toMd5Result.size());
    assertEquals(8L, actualToHashResult.size());
    assertFalse(toMd5Result.isEmpty());
    assertFalse(actualToHashResult.isEmpty());
    Optional<String> fileName = actualToHashResult.getFileName();
    assertFalse(fileName.isPresent());
    assertSame(fileName, toMd5Result.getFileName());
    byte[] expectedReadUnsafeResult = "AXAXAXAX".getBytes("UTF-8");
    assertArrayEquals(expectedReadUnsafeResult, actualToHashResult.readUnsafe());
    assertArrayEquals(
        new byte[] {-94, 31, -88, '\'', '?', 'M', 18, -56, -60, '2', 'b', -44, -65, 'H', -73, -50},
        toMd5Result.readUnsafe());
  }

  /**
   * Test {@link BeanByteSource#toBase64()}.
   *
   * <ul>
   *   <li>Given {@link ArrayByteSource#EMPTY}.
   *   <li>Then return {@link ArrayByteSource#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link BeanByteSource#toBase64()}
   */
  @Test
  @DisplayName("Test toBase64(); given EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource BeanByteSource.toBase64()"})
  void testToBase64_givenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(ArrayByteSource.EMPTY, ArrayByteSource.EMPTY.toBase64());
  }

  /**
   * Test {@link BeanByteSource#toBase64()}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link BeanByteSource#toBase64()}
   */
  @Test
  @DisplayName("Test toBase64(); then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayByteSource BeanByteSource.toBase64()"})
  void testToBase64_thenThrowUncheckedIOException() {
    // Arrange, Act and Assert
    assertThrows(
        UncheckedIOException.class,
        () ->
            FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile())
                .toBase64());
  }

  /**
   * Test {@link BeanByteSource#toBase64String()}.
   *
   * <ul>
   *   <li>Given {@link ArrayByteSource#EMPTY}.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link BeanByteSource#toBase64String()}
   */
  @Test
  @DisplayName("Test toBase64String(); given EMPTY; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BeanByteSource.toBase64String()"})
  void testToBase64String_givenEmpty_thenReturnEmptyString() {
    // Arrange, Act and Assert
    assertEquals("", ArrayByteSource.EMPTY.toBase64String());
  }

  /**
   * Test {@link BeanByteSource#toBase64String()}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link BeanByteSource#toBase64String()}
   */
  @Test
  @DisplayName("Test toBase64String(); then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BeanByteSource.toBase64String()"})
  void testToBase64String_thenThrowUncheckedIOException() {
    // Arrange, Act and Assert
    assertThrows(
        UncheckedIOException.class,
        () ->
            FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile())
                .toBase64String());
  }
}
