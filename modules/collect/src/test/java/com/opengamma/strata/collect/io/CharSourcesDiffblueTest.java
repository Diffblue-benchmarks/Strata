package com.opengamma.strata.collect.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.google.common.io.CharSource;
import com.opengamma.strata.collect.io.BeanByteSource.AsBeanCharSource;
import com.opengamma.strata.collect.io.UnicodeBom.UnicodeBomCharSource;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CharSourcesDiffblueTest {
  /**
   * Test {@link CharSources#ofContent(byte[])} with {@code byte[]}.
   *
   * <p>Method under test: {@link CharSources#ofContent(byte[])}
   */
  @Test
  @DisplayName("Test ofContent(byte[]) with 'byte[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StringCharSource CharSources.ofContent(byte[])"})
  void testOfContentWithByte() throws UnsupportedEncodingException {
    // Arrange and Act
    StringCharSource actualOfContentResult = CharSources.ofContent("AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals("AXAXAXAX", actualOfContentResult.readFirstLine());
    ImmutableList<String> readLinesResult = actualOfContentResult.readLines();
    assertEquals(1, readLinesResult.size());
    assertEquals("AXAXAXAX", readLinesResult.get(0));
    assertEquals(8L, actualOfContentResult.length());
    assertFalse(actualOfContentResult.isEmpty());
    assertFalse(actualOfContentResult.getFileName().isPresent());
  }

  /**
   * Test {@link CharSources#ofContent(byte[], Charset)} with {@code byte[]}, {@code Charset}.
   *
   * <ul>
   *   <li>When forName {@code UTF-8}.
   *   <li>Then return readFirstLine is {@code AXAXAXAX}.
   * </ul>
   *
   * <p>Method under test: {@link CharSources#ofContent(byte[], Charset)}
   */
  @Test
  @DisplayName(
      "Test ofContent(byte[], Charset) with 'byte[]', 'Charset'; when forName 'UTF-8'; then return readFirstLine is 'AXAXAXAX'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StringCharSource CharSources.ofContent(byte[], Charset)"})
  void testOfContentWithByteCharset_whenForNameUtf8_thenReturnReadFirstLineIsAxaxaxax()
      throws UnsupportedEncodingException {
    // Arrange
    byte[] content = "AXAXAXAX".getBytes("UTF-8");

    // Act
    StringCharSource actualOfContentResult =
        CharSources.ofContent(content, Charset.forName("UTF-8"));

    // Assert
    assertEquals("AXAXAXAX", actualOfContentResult.readFirstLine());
    ImmutableList<String> readLinesResult = actualOfContentResult.readLines();
    assertEquals(1, readLinesResult.size());
    assertEquals("AXAXAXAX", readLinesResult.get(0));
    assertEquals(8L, actualOfContentResult.length());
    assertFalse(actualOfContentResult.isEmpty());
    assertFalse(actualOfContentResult.getFileName().isPresent());
  }

  /**
   * Test {@link CharSources#ofContent(String)} with {@code String}.
   *
   * <p>Method under test: {@link CharSources#ofContent(String)}
   */
  @Test
  @DisplayName("Test ofContent(String) with 'String'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StringCharSource CharSources.ofContent(String)"})
  void testOfContentWithString() {
    // Arrange and Act
    StringCharSource actualOfContentResult = CharSources.ofContent("Not all who wander are lost");

    // Assert
    assertEquals("Not all who wander are lost", actualOfContentResult.readFirstLine());
    ImmutableList<String> readLinesResult = actualOfContentResult.readLines();
    assertEquals(1, readLinesResult.size());
    assertEquals("Not all who wander are lost", readLinesResult.get(0));
    assertEquals(27L, actualOfContentResult.length());
    assertFalse(actualOfContentResult.isEmpty());
    assertFalse(actualOfContentResult.getFileName().isPresent());
  }

  /**
   * Test {@link CharSources#extractFileName(CharSource)}.
   *
   * <p>Method under test: {@link CharSources#extractFileName(CharSource)}
   */
  @Test
  @DisplayName("Test extractFileName(CharSource)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CharSources.extractFileName(CharSource)"})
  void testExtractFileName() {
    // Arrange
    AsBeanCharSource source = new AsBeanCharSource(ArrayByteSource.EMPTY, Charset.forName("UTF-8"));

    // Act and Assert
    assertEquals("Unknown.txt", CharSources.extractFileName(source));
  }

  /**
   * Test {@link CharSources#extractFileName(CharSource)}.
   *
   * <ul>
   *   <li>Then return {@code test.txt}.
   * </ul>
   *
   * <p>Method under test: {@link CharSources#extractFileName(CharSource)}
   */
  @Test
  @DisplayName("Test extractFileName(CharSource); then return 'test.txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CharSources.extractFileName(CharSource)"})
  void testExtractFileName_thenReturnTestTxt() {
    // Arrange
    FileByteSource underlying =
        FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());

    // Act and Assert
    assertEquals("test.txt", CharSources.extractFileName(new UnicodeBomCharSource(underlying)));
  }

  /**
   * Test {@link CharSources#extractFileName(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource#EMPTY}.
   *   <li>Then return {@code Unknown.txt}.
   * </ul>
   *
   * <p>Method under test: {@link CharSources#extractFileName(CharSource)}
   */
  @Test
  @DisplayName("Test extractFileName(CharSource); when EMPTY; then return 'Unknown.txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CharSources.extractFileName(CharSource)"})
  void testExtractFileName_whenEmpty_thenReturnUnknownTxt() {
    // Arrange, Act and Assert
    assertEquals("Unknown.txt", CharSources.extractFileName(StringCharSource.EMPTY));
  }

  /**
   * Test {@link CharSources#extractFileName(CharSource)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code Null.txt}.
   * </ul>
   *
   * <p>Method under test: {@link CharSources#extractFileName(CharSource)}
   */
  @Test
  @DisplayName("Test extractFileName(CharSource); when 'null'; then return 'Null.txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CharSources.extractFileName(CharSource)"})
  void testExtractFileName_whenNull_thenReturnNullTxt() {
    // Arrange, Act and Assert
    assertEquals("Null.txt", CharSources.extractFileName(null));
  }
}
