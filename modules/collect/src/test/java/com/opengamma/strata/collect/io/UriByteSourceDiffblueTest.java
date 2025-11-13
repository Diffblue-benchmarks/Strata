package com.opengamma.strata.collect.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.io.UriByteSource.Meta;
import java.io.UncheckedIOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Optional;
import org.joda.beans.MetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UriByteSourceDiffblueTest {
  /**
   * Test {@link UriByteSource#of(URI)} with {@code uri}.
   *
   * <ul>
   *   <li>Then return FileNameOrThrow is {@code test.txt}.
   * </ul>
   *
   * <p>Method under test: {@link UriByteSource#of(URI)}
   */
  @Test
  @DisplayName("Test of(URI) with 'uri'; then return FileNameOrThrow is 'test.txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UriByteSource UriByteSource.of(URI)"})
  void testOfWithUri_thenReturnFileNameOrThrowIsTestTxt() {
    // Arrange
    URI uri = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri();

    // Act
    UriByteSource actualOfResult = UriByteSource.of(uri);

    // Assert
    assertEquals("test.txt", actualOfResult.getFileNameOrThrow());
    Optional<String> fileName = actualOfResult.getFileName();
    assertEquals("test.txt", fileName.get());
    assertTrue(fileName.isPresent());
    assertSame(uri, actualOfResult.getUri());
  }

  /**
   * Test {@link UriByteSource#of(URL)} with {@code url}.
   *
   * <p>Method under test: {@link UriByteSource#of(URL)}
   */
  @Test
  @DisplayName("Test of(URL) with 'url'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UriByteSource UriByteSource.of(URL)"})
  void testOfWithUrl() throws MalformedURLException {
    // Arrange and Act
    UriByteSource actualOfResult =
        UriByteSource.of(
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri().toURL());

    // Assert
    assertEquals("test.txt", actualOfResult.getFileNameOrThrow());
    Optional<String> fileName = actualOfResult.getFileName();
    assertEquals("test.txt", fileName.get());
    assertTrue(fileName.isPresent());
    String expectedToStringResult =
        String.join(
            "",
            ResourceLocator.FILE_URL_PREFIX,
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString());
    assertEquals(expectedToStringResult, actualOfResult.getUri().toString());
  }

  /**
   * Test {@link UriByteSource#metaBean()}.
   *
   * <p>Method under test: {@link UriByteSource#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaBean UriByteSource.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    MetaBean actualMetaBeanResult =
        UriByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri())
            .metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof Meta);
    assertTrue(actualMetaBeanResult.isBuildable());
  }

  /**
   * Test {@link UriByteSource#getFileName()}.
   *
   * <p>Method under test: {@link UriByteSource#getFileName()}
   */
  @Test
  @DisplayName("Test getFileName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional UriByteSource.getFileName()"})
  void testGetFileName() {
    // Arrange and Act
    Optional<String> actualFileName =
        UriByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri())
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
   *   <li>{@link UriByteSource#toString()}
   *   <li>{@link UriByteSource#getUri()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"URI UriByteSource.getUri()", "String UriByteSource.toString()"})
  void testGettersAndSetters() {
    // Arrange
    UriByteSource ofResult =
        UriByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri());

    // Act
    String actualToStringResult = ofResult.toString();

    // Assert
    assertEquals(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri().toString(),
        ofResult.getUri().toString());
    String expectedToStringResult =
        String.join(
            "",
            "UriByteSource[",
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri().toString(),
            "]");
    assertEquals(expectedToStringResult, actualToStringResult);
  }

  /**
   * Test {@link UriByteSource#load()}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link UriByteSource#load()}
   */
  @Test
  @DisplayName("Test load(); then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.opengamma.strata.collect.io.ArrayByteSource UriByteSource.load()"})
  void testLoad_thenThrowUncheckedIOException() {
    // Arrange, Act and Assert
    assertThrows(
        UncheckedIOException.class,
        () ->
            UriByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri())
                .load());
  }

  /**
   * Test {@link UriByteSource#equals(Object)}, and {@link UriByteSource#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UriByteSource#equals(Object)}
   *   <li>{@link UriByteSource#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UriByteSource.equals(Object)", "int UriByteSource.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UriByteSource ofResult =
        UriByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri());
    UriByteSource ofResult2 =
        UriByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri());

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link UriByteSource#equals(Object)}, and {@link UriByteSource#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UriByteSource#equals(Object)}
   *   <li>{@link UriByteSource#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UriByteSource.equals(Object)", "int UriByteSource.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UriByteSource ofResult =
        UriByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri());

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link UriByteSource#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UriByteSource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UriByteSource.equals(Object)", "int UriByteSource.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri();

    // Act and Assert
    assertNotEquals(
        UriByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri()), 1);
  }

  /**
   * Test {@link UriByteSource#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UriByteSource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UriByteSource.equals(Object)", "int UriByteSource.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        UriByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri()),
        null);
  }

  /**
   * Test {@link UriByteSource#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UriByteSource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UriByteSource.equals(Object)", "int UriByteSource.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        UriByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri()),
        "Different type to UriByteSource");
  }
}
