package com.opengamma.strata.collect.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.io.BeanByteSource.AsBeanCharSource;
import com.opengamma.strata.collect.io.UnicodeBom.UnicodeBomCharSource;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ResourceLocatorDiffblueTest {
  /**
   * Test {@link ResourceLocator#of(String)}.
   *
   * <ul>
   *   <li>When {@code classpath:locator}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ResourceLocator#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'classpath:locator'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ResourceLocator ResourceLocator.of(String)"})
  void testOf_whenClasspathLocator_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ResourceLocator.of("classpath:locator"));
  }

  /**
   * Test {@link ResourceLocator#of(String)}.
   *
   * <ul>
   *   <li>When {@link ResourceLocator#FILE_URL_PREFIX}.
   *   <li>Then return ByteSource File Name is empty string.
   * </ul>
   *
   * <p>Method under test: {@link ResourceLocator#of(String)}
   */
  @Test
  @DisplayName(
      "Test of(String); when FILE_URL_PREFIX; then return ByteSource File Name is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ResourceLocator ResourceLocator.of(String)"})
  void testOf_whenFile_url_prefix_thenReturnByteSourceFileNameIsEmptyString() {
    // Arrange and Act
    ResourceLocator actualOfResult = ResourceLocator.of(ResourceLocator.FILE_URL_PREFIX);

    // Assert
    BeanByteSource byteSource = actualOfResult.getByteSource();
    assertTrue(byteSource instanceof FileByteSource);
    BeanCharSource charSource = actualOfResult.getCharSource();
    assertTrue(charSource instanceof UnicodeBomCharSource);
    assertEquals("", ((FileByteSource) byteSource).getFile().getName());
    Optional<String> fileName = byteSource.getFileName();
    assertEquals("", fileName.get());
    assertEquals(fileName, charSource.getFileName());
    assertEquals(ResourceLocator.FILE_URL_PREFIX, actualOfResult.getLocator());
    assertEquals(ResourceLocator.FILE_URL_PREFIX, actualOfResult.toString());
  }

  /**
   * Test {@link ResourceLocator#of(String)}.
   *
   * <ul>
   *   <li>When {@code Locator}.
   *   <li>Then return ByteSource FileNameOrThrow is {@code Locator}.
   * </ul>
   *
   * <p>Method under test: {@link ResourceLocator#of(String)}
   */
  @Test
  @DisplayName(
      "Test of(String); when 'Locator'; then return ByteSource FileNameOrThrow is 'Locator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ResourceLocator ResourceLocator.of(String)"})
  void testOf_whenLocator_thenReturnByteSourceFileNameOrThrowIsLocator() {
    // Arrange and Act
    ResourceLocator actualOfResult = ResourceLocator.of("Locator");

    // Assert
    BeanByteSource byteSource = actualOfResult.getByteSource();
    assertTrue(byteSource instanceof FileByteSource);
    BeanCharSource charSource = actualOfResult.getCharSource();
    assertTrue(charSource instanceof UnicodeBomCharSource);
    assertEquals("Locator", byteSource.getFileNameOrThrow());
    assertEquals("Locator", charSource.getFileNameOrThrow());
    assertEquals("Locator", ((FileByteSource) byteSource).getFile().getName());
    Optional<String> fileName = byteSource.getFileName();
    assertEquals("Locator", fileName.get());
    assertEquals("file:Locator", actualOfResult.getLocator());
    assertEquals("file:Locator", actualOfResult.toString());
    assertEquals(fileName, charSource.getFileName());
  }

  /**
   * Test {@link ResourceLocator#of(String)}.
   *
   * <ul>
   *   <li>When {@code url:file:}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ResourceLocator#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'url:file:'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ResourceLocator ResourceLocator.of(String)"})
  void testOf_whenUrlFile_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ResourceLocator.of("url:file:"));
  }

  /**
   * Test {@link ResourceLocator#of(String)}.
   *
   * <ul>
   *   <li>When {@link ResourceLocator#URL_PREFIX}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ResourceLocator#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when URL_PREFIX; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ResourceLocator ResourceLocator.of(String)"})
  void testOf_whenUrl_prefix_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ResourceLocator.of(ResourceLocator.URL_PREFIX));
  }

  /**
   * Test {@link ResourceLocator#ofFile(File)}.
   *
   * <ul>
   *   <li>Then ByteSource return {@link FileByteSource}.
   * </ul>
   *
   * <p>Method under test: {@link ResourceLocator#ofFile(File)}
   */
  @Test
  @DisplayName("Test ofFile(File); then ByteSource return FileByteSource")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ResourceLocator ResourceLocator.ofFile(File)"})
  void testOfFile_thenByteSourceReturnFileByteSource() {
    // Arrange
    File file = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile();

    // Act
    ResourceLocator actualOfFileResult = ResourceLocator.ofFile(file);

    // Assert
    BeanByteSource byteSource = actualOfFileResult.getByteSource();
    assertTrue(byteSource instanceof FileByteSource);
    BeanCharSource charSource = actualOfFileResult.getCharSource();
    assertTrue(charSource instanceof UnicodeBomCharSource);
    assertEquals("test.txt", byteSource.getFileNameOrThrow());
    assertEquals("test.txt", charSource.getFileNameOrThrow());
    Optional<String> fileName = byteSource.getFileName();
    assertEquals("test.txt", fileName.get());
    assertTrue(fileName.isPresent());
    assertEquals(fileName, charSource.getFileName());
    String expectedLocator =
        String.join(
            "",
            ResourceLocator.FILE_URL_PREFIX,
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString());
    assertEquals(expectedLocator, actualOfFileResult.getLocator());
    String expectedToStringResult =
        String.join(
            "",
            ResourceLocator.FILE_URL_PREFIX,
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString());
    assertEquals(expectedToStringResult, actualOfFileResult.toString());
    assertSame(file, ((FileByteSource) byteSource).getFile());
  }

  /**
   * Test {@link ResourceLocator#ofPath(Path)}.
   *
   * <ul>
   *   <li>Then ByteSource return {@link FileByteSource}.
   * </ul>
   *
   * <p>Method under test: {@link ResourceLocator#ofPath(Path)}
   */
  @Test
  @DisplayName("Test ofPath(Path); then ByteSource return FileByteSource")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ResourceLocator ResourceLocator.ofPath(Path)"})
  void testOfPath_thenByteSourceReturnFileByteSource() {
    // Arrange and Act
    ResourceLocator actualOfPathResult =
        ResourceLocator.ofPath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

    // Assert
    BeanByteSource byteSource = actualOfPathResult.getByteSource();
    assertTrue(byteSource instanceof FileByteSource);
    BeanCharSource charSource = actualOfPathResult.getCharSource();
    assertTrue(charSource instanceof UnicodeBomCharSource);
    assertEquals("test.txt", byteSource.getFileNameOrThrow());
    assertEquals("test.txt", charSource.getFileNameOrThrow());
    File file = ((FileByteSource) byteSource).getFile();
    assertEquals("test.txt", file.getName());
    Optional<String> fileName = byteSource.getFileName();
    assertEquals("test.txt", fileName.get());
    assertTrue(file.isAbsolute());
    assertTrue(fileName.isPresent());
    assertEquals(fileName, charSource.getFileName());
    String expectedLocator =
        String.join(
            "",
            ResourceLocator.FILE_URL_PREFIX,
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString());
    assertEquals(expectedLocator, actualOfPathResult.getLocator());
    String expectedToStringResult =
        String.join(
            "",
            ResourceLocator.FILE_URL_PREFIX,
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString());
    assertEquals(expectedToStringResult, actualOfPathResult.toString());
  }

  /**
   * Test {@link ResourceLocator#ofUrl(URL)}.
   *
   * <ul>
   *   <li>Then CharSource return {@link UnicodeBomCharSource}.
   * </ul>
   *
   * <p>Method under test: {@link ResourceLocator#ofUrl(URL)}
   */
  @Test
  @DisplayName("Test ofUrl(URL); then CharSource return UnicodeBomCharSource")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ResourceLocator ResourceLocator.ofUrl(URL)"})
  void testOfUrl_thenCharSourceReturnUnicodeBomCharSource() throws MalformedURLException {
    // Arrange and Act
    ResourceLocator actualOfUrlResult =
        ResourceLocator.ofUrl(
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri().toURL());

    // Assert
    BeanCharSource charSource = actualOfUrlResult.getCharSource();
    assertTrue(charSource instanceof UnicodeBomCharSource);
    BeanByteSource byteSource = actualOfUrlResult.getByteSource();
    assertTrue(byteSource instanceof UriByteSource);
    assertEquals("test.txt", byteSource.getFileNameOrThrow());
    assertEquals("test.txt", charSource.getFileNameOrThrow());
    Optional<String> fileName = byteSource.getFileName();
    assertEquals("test.txt", fileName.get());
    assertTrue(fileName.isPresent());
    assertEquals(fileName, charSource.getFileName());
    String expectedLocator =
        String.join(
            "",
            "url:file:",
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString());
    assertEquals(expectedLocator, actualOfUrlResult.getLocator());
    String expectedToStringResult =
        String.join(
            "",
            "url:file:",
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString());
    assertEquals(expectedToStringResult, actualOfUrlResult.toString());
    String expectedToStringResult2 =
        String.join(
            "",
            ResourceLocator.FILE_URL_PREFIX,
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString());
    assertEquals(expectedToStringResult2, ((UriByteSource) byteSource).getUri().toString());
  }

  /**
   * Test {@link ResourceLocator#ofClasspath(Class, String)} with {@code cls}, {@code resourceName}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ResourceLocator#ofClasspath(Class, String)}
   */
  @Test
  @DisplayName(
      "Test ofClasspath(Class, String) with 'cls', 'resourceName'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ResourceLocator ResourceLocator.ofClasspath(Class, String)"})
  void testOfClasspathWithClsResourceName_thenThrowIllegalArgumentException() {
    // Arrange
    Class<Object> cls = Object.class;

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ResourceLocator.ofClasspath(cls, "Resource Name"));
  }

  /**
   * Test {@link ResourceLocator#ofClasspath(String)} with {@code resourceName}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ResourceLocator#ofClasspath(String)}
   */
  @Test
  @DisplayName("Test ofClasspath(String) with 'resourceName'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ResourceLocator ResourceLocator.ofClasspath(String)"})
  void testOfClasspathWithResourceName_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ResourceLocator.ofClasspath("Resource Name"));
  }

  /**
   * Test {@link ResourceLocator#ofClasspathUrl(URL)}.
   *
   * <ul>
   *   <li>Then CharSource return {@link UnicodeBomCharSource}.
   * </ul>
   *
   * <p>Method under test: {@link ResourceLocator#ofClasspathUrl(URL)}
   */
  @Test
  @DisplayName("Test ofClasspathUrl(URL); then CharSource return UnicodeBomCharSource")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ResourceLocator ResourceLocator.ofClasspathUrl(URL)"})
  void testOfClasspathUrl_thenCharSourceReturnUnicodeBomCharSource() throws MalformedURLException {
    // Arrange and Act
    ResourceLocator actualOfClasspathUrlResult =
        ResourceLocator.ofClasspathUrl(
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri().toURL());

    // Assert
    BeanCharSource charSource = actualOfClasspathUrlResult.getCharSource();
    assertTrue(charSource instanceof UnicodeBomCharSource);
    BeanByteSource byteSource = actualOfClasspathUrlResult.getByteSource();
    assertTrue(byteSource instanceof UriByteSource);
    assertEquals("test.txt", byteSource.getFileNameOrThrow());
    assertEquals("test.txt", charSource.getFileNameOrThrow());
    Optional<String> fileName = byteSource.getFileName();
    assertEquals("test.txt", fileName.get());
    assertTrue(fileName.isPresent());
    assertEquals(fileName, charSource.getFileName());
    String expectedLocator =
        String.join(
            "",
            "classpath:file:",
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString());
    assertEquals(expectedLocator, actualOfClasspathUrlResult.getLocator());
    String expectedToStringResult =
        String.join(
            "",
            "classpath:file:",
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString());
    assertEquals(expectedToStringResult, actualOfClasspathUrlResult.toString());
    String expectedToStringResult2 =
        String.join(
            "",
            ResourceLocator.FILE_URL_PREFIX,
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString());
    assertEquals(expectedToStringResult2, ((UriByteSource) byteSource).getUri().toString());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ResourceLocator#getByteSource()}
   *   <li>{@link ResourceLocator#getLocator()}
   *   <li>{@link ResourceLocator#toString()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BeanByteSource ResourceLocator.getByteSource()",
    "String ResourceLocator.getLocator()",
    "String ResourceLocator.toString()"
  })
  void testGettersAndSetters() throws MalformedURLException {
    // Arrange
    ResourceLocator ofClasspathUrlResult =
        ResourceLocator.ofClasspathUrl(
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri().toURL());

    // Act
    BeanByteSource actualByteSource = ofClasspathUrlResult.getByteSource();
    String actualLocator = ofClasspathUrlResult.getLocator();
    String actualToStringResult = ofClasspathUrlResult.toString();

    // Assert
    assertTrue(actualByteSource instanceof UriByteSource);
    String expectedLocator =
        String.join(
            "",
            "classpath:file:",
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString());
    assertEquals(expectedLocator, actualLocator);
    String expectedToStringResult =
        String.join(
            "",
            "classpath:file:",
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString());
    assertEquals(expectedToStringResult, actualToStringResult);
  }

  /**
   * Test {@link ResourceLocator#getCharSource()}.
   *
   * <p>Method under test: {@link ResourceLocator#getCharSource()}
   */
  @Test
  @DisplayName("Test getCharSource()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BeanCharSource ResourceLocator.getCharSource()"})
  void testGetCharSource() throws MalformedURLException {
    // Arrange and Act
    BeanCharSource actualCharSource =
        ResourceLocator.ofClasspathUrl(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri().toURL())
            .getCharSource();

    // Assert
    assertTrue(actualCharSource instanceof UnicodeBomCharSource);
    assertEquals("test.txt", actualCharSource.getFileNameOrThrow());
    Optional<String> fileName = actualCharSource.getFileName();
    assertEquals("test.txt", fileName.get());
    assertTrue(fileName.isPresent());
  }

  /**
   * Test {@link ResourceLocator#getCharSource(Charset)} with {@code Charset}.
   *
   * <ul>
   *   <li>When forName {@code UTF-8}.
   *   <li>Then return {@link AsBeanCharSource}.
   * </ul>
   *
   * <p>Method under test: {@link ResourceLocator#getCharSource(Charset)}
   */
  @Test
  @DisplayName(
      "Test getCharSource(Charset) with 'Charset'; when forName 'UTF-8'; then return AsBeanCharSource")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BeanCharSource ResourceLocator.getCharSource(Charset)"})
  void testGetCharSourceWithCharset_whenForNameUtf8_thenReturnAsBeanCharSource()
      throws MalformedURLException {
    // Arrange
    ResourceLocator ofClasspathUrlResult =
        ResourceLocator.ofClasspathUrl(
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri().toURL());

    // Act
    BeanCharSource actualCharSource = ofClasspathUrlResult.getCharSource(Charset.forName("UTF-8"));

    // Assert
    assertTrue(actualCharSource instanceof AsBeanCharSource);
    assertEquals("test.txt", actualCharSource.getFileNameOrThrow());
    Optional<String> fileName = actualCharSource.getFileName();
    assertEquals("test.txt", fileName.get());
    assertTrue(fileName.isPresent());
  }

  /**
   * Test {@link ResourceLocator#equals(Object)}, and {@link ResourceLocator#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ResourceLocator#equals(Object)}
   *   <li>{@link ResourceLocator#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ResourceLocator.equals(Object)", "int ResourceLocator.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() throws MalformedURLException {
    // Arrange
    ResourceLocator ofClasspathUrlResult =
        ResourceLocator.ofClasspathUrl(
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri().toURL());
    ResourceLocator ofClasspathUrlResult2 =
        ResourceLocator.ofClasspathUrl(
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri().toURL());

    // Act and Assert
    assertEquals(ofClasspathUrlResult, ofClasspathUrlResult2);
    assertEquals(ofClasspathUrlResult.hashCode(), ofClasspathUrlResult2.hashCode());
  }

  /**
   * Test {@link ResourceLocator#equals(Object)}, and {@link ResourceLocator#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ResourceLocator#equals(Object)}
   *   <li>{@link ResourceLocator#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ResourceLocator.equals(Object)", "int ResourceLocator.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() throws MalformedURLException {
    // Arrange
    ResourceLocator ofClasspathUrlResult =
        ResourceLocator.ofClasspathUrl(
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri().toURL());

    // Act and Assert
    assertEquals(ofClasspathUrlResult, ofClasspathUrlResult);
    int expectedHashCodeResult = ofClasspathUrlResult.hashCode();
    assertEquals(expectedHashCodeResult, ofClasspathUrlResult.hashCode());
  }

  /**
   * Test {@link ResourceLocator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ResourceLocator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ResourceLocator.equals(Object)", "int ResourceLocator.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() throws MalformedURLException {
    // Arrange
    Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri().toURL();
    ResourceLocator ofFileResult =
        ResourceLocator.ofFile(
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());

    // Act and Assert
    assertNotEquals(
        ofFileResult,
        ResourceLocator.ofClasspathUrl(
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri().toURL()));
  }

  /**
   * Test {@link ResourceLocator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ResourceLocator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ResourceLocator.equals(Object)", "int ResourceLocator.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() throws MalformedURLException {
    // Arrange, Act and Assert
    assertNotEquals(
        ResourceLocator.ofClasspathUrl(
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri().toURL()),
        null);
  }

  /**
   * Test {@link ResourceLocator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ResourceLocator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ResourceLocator.equals(Object)", "int ResourceLocator.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() throws MalformedURLException {
    // Arrange, Act and Assert
    assertNotEquals(
        ResourceLocator.ofClasspathUrl(
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri().toURL()),
        "Different type to ResourceLocator");
  }
}
