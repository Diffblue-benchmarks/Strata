package com.opengamma.strata.collect.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.io.FileByteSource.Meta;
import java.io.File;
import java.io.UncheckedIOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import org.joda.beans.MetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FileByteSourceDiffblueTest {
  /**
   * Test {@link FileByteSource#of(File)} with {@code file}.
   *
   * <ul>
   *   <li>Then return FileNameOrThrow is {@code test.txt}.
   * </ul>
   *
   * <p>Method under test: {@link FileByteSource#of(File)}
   */
  @Test
  @DisplayName("Test of(File) with 'file'; then return FileNameOrThrow is 'test.txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FileByteSource FileByteSource.of(File)"})
  void testOfWithFile_thenReturnFileNameOrThrowIsTestTxt() {
    // Arrange
    File file = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile();

    // Act
    FileByteSource actualOfResult = FileByteSource.of(file);

    // Assert
    assertEquals("test.txt", actualOfResult.getFileNameOrThrow());
    Optional<String> fileName = actualOfResult.getFileName();
    assertEquals("test.txt", fileName.get());
    assertTrue(fileName.isPresent());
    assertSame(file, actualOfResult.getFile());
  }

  /**
   * Test {@link FileByteSource#of(Path)} with {@code path}.
   *
   * <ul>
   *   <li>Then return FileNameOrThrow is {@code test.txt}.
   * </ul>
   *
   * <p>Method under test: {@link FileByteSource#of(Path)}
   */
  @Test
  @DisplayName("Test of(Path) with 'path'; then return FileNameOrThrow is 'test.txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FileByteSource FileByteSource.of(Path)"})
  void testOfWithPath_thenReturnFileNameOrThrowIsTestTxt() {
    // Arrange and Act
    FileByteSource actualOfResult =
        FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

    // Assert
    assertEquals("test.txt", actualOfResult.getFileNameOrThrow());
    File file = actualOfResult.getFile();
    assertEquals("test.txt", file.getName());
    Optional<String> fileName = actualOfResult.getFileName();
    assertEquals("test.txt", fileName.get());
    assertTrue(file.isAbsolute());
    assertTrue(fileName.isPresent());
  }

  /**
   * Test {@link FileByteSource#metaBean()}.
   *
   * <p>Method under test: {@link FileByteSource#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaBean FileByteSource.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    MetaBean actualMetaBeanResult =
        FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile())
            .metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof Meta);
    assertTrue(actualMetaBeanResult.isBuildable());
  }

  /**
   * Test {@link FileByteSource#getFileName()}.
   *
   * <p>Method under test: {@link FileByteSource#getFileName()}
   */
  @Test
  @DisplayName("Test getFileName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional FileByteSource.getFileName()"})
  void testGetFileName() {
    // Arrange and Act
    Optional<String> actualFileName =
        FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile())
            .getFileName();

    // Assert
    assertEquals("test.txt", actualFileName.get());
    assertTrue(actualFileName.isPresent());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FileByteSource#toString()}
   *   <li>{@link FileByteSource#getFile()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"File FileByteSource.getFile()", "String FileByteSource.toString()"})
  void testGettersAndSetters() {
    // Arrange
    FileByteSource ofResult =
        FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());

    // Act
    String actualToStringResult = ofResult.toString();
    File actualFile = ofResult.getFile();

    // Assert
    assertEquals("test.txt", actualFile.getName());
    assertTrue(actualFile.isAbsolute());
    String expectedToStringResult =
        String.join(
            "",
            "FileByteSource[",
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString(),
            "]");
    assertEquals(expectedToStringResult, actualToStringResult);
  }

  /**
   * Test {@link FileByteSource#sizeIfKnown()}.
   *
   * <p>Method under test: {@link FileByteSource#sizeIfKnown()}
   */
  @Test
  @DisplayName("Test sizeIfKnown()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.base.Optional FileByteSource.sizeIfKnown()"})
  void testSizeIfKnown() {
    // Arrange, Act and Assert
    assertFalse(
        FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile())
            .sizeIfKnown()
            .toJavaUtil()
            .isPresent());
  }

  /**
   * Test {@link FileByteSource#size()}.
   *
   * <p>Method under test: {@link FileByteSource#size()}
   */
  @Test
  @DisplayName("Test size()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long FileByteSource.size()"})
  void testSize() {
    // Arrange, Act and Assert
    assertThrows(
        UncheckedIOException.class,
        () ->
            FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile())
                .size());
  }

  /**
   * Test {@link FileByteSource#load()}.
   *
   * <p>Method under test: {@link FileByteSource#load()}
   */
  @Test
  @DisplayName("Test load()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.opengamma.strata.collect.io.ArrayByteSource FileByteSource.load()"})
  void testLoad() {
    // Arrange, Act and Assert
    assertThrows(
        UncheckedIOException.class,
        () ->
            FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile())
                .load());
  }

  /**
   * Test {@link FileByteSource#equals(Object)}, and {@link FileByteSource#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FileByteSource#equals(Object)}
   *   <li>{@link FileByteSource#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FileByteSource.equals(Object)", "int FileByteSource.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    FileByteSource ofResult =
        FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());
    FileByteSource ofResult2 =
        FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link FileByteSource#equals(Object)}, and {@link FileByteSource#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FileByteSource#equals(Object)}
   *   <li>{@link FileByteSource#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FileByteSource.equals(Object)", "int FileByteSource.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    FileByteSource ofResult =
        FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link FileByteSource#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FileByteSource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FileByteSource.equals(Object)", "int FileByteSource.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");

    // Act and Assert
    assertNotEquals(
        FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile()), 1);
  }

  /**
   * Test {@link FileByteSource#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FileByteSource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FileByteSource.equals(Object)", "int FileByteSource.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile()),
        null);
  }

  /**
   * Test {@link FileByteSource#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FileByteSource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FileByteSource.equals(Object)", "int FileByteSource.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        FileByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile()),
        "Different type to FileByteSource");
  }
}
