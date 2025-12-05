package com.opengamma.strata.collect.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SafeFilesDiffblueTest {
  /**
   * Test {@link SafeFiles#listAll(Path)}.
   *
   * <ul>
   *   <li>When Property is {@code java.io.tmpdir} is {@code test.txt}.
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link SafeFiles#listAll(Path)}
   */
  @Test
  @DisplayName(
      "Test listAll(Path); when Property is 'java.io.tmpdir' is 'test.txt'; then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List SafeFiles.listAll(Path)"})
  void testListAll_whenPropertyIsJavaIoTmpdirIsTestTxt_thenThrowUncheckedIOException() {
    // Arrange, Act and Assert
    assertThrows(
        UncheckedIOException.class,
        () -> SafeFiles.listAll(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
  }

  /**
   * Test {@link SafeFiles#list(Path, Function)}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>When Property is {@code java.io.tmpdir} is empty string.
   *   <li>Then return {@code Apply}.
   * </ul>
   *
   * <p>Method under test: {@link SafeFiles#list(Path, Function)}
   */
  @Test
  @DisplayName(
      "Test list(Path, Function); given 'Apply'; when Property is 'java.io.tmpdir' is empty string; then return 'Apply'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object SafeFiles.list(Path, Function)"})
  void testList_givenApply_whenPropertyIsJavaIoTmpdirIsEmptyString_thenReturnApply() {
    // Arrange
    Path dir = Paths.get(System.getProperty("java.io.tmpdir"), "");

    Function<Stream<Path>, Object> function = mock(Function.class);
    when(function.apply(Mockito.<Stream<Path>>any())).thenReturn("Apply");

    // Act
    Object actualListResult = SafeFiles.list(dir, function);

    // Assert
    verify(function).apply(isA(Stream.class));
    assertEquals("Apply", actualListResult);
  }

  /**
   * Test {@link SafeFiles#list(Path, Function)}.
   *
   * <ul>
   *   <li>Given {@link UncheckedIOException#UncheckedIOException(IOException)} with {@link
   *       IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link SafeFiles#list(Path, Function)}
   */
  @Test
  @DisplayName(
      "Test list(Path, Function); given UncheckedIOException(IOException) with IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object SafeFiles.list(Path, Function)"})
  void testList_givenUncheckedIOExceptionWithIOException() {
    // Arrange
    Path dir = Paths.get(System.getProperty("java.io.tmpdir"), "");

    Function<Stream<Path>, Object> function = mock(Function.class);
    when(function.apply(Mockito.<Stream<Path>>any()))
        .thenThrow(new UncheckedIOException(new IOException()));

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> SafeFiles.list(dir, function));
    verify(function).apply(isA(Stream.class));
  }

  /**
   * Test {@link SafeFiles#list(Path, Function)}.
   *
   * <ul>
   *   <li>When Property is {@code java.io.tmpdir} is {@code test.txt}.
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link SafeFiles#list(Path, Function)}
   */
  @Test
  @DisplayName(
      "Test list(Path, Function); when Property is 'java.io.tmpdir' is 'test.txt'; then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object SafeFiles.list(Path, Function)"})
  void testList_whenPropertyIsJavaIoTmpdirIsTestTxt_thenThrowUncheckedIOException() {
    // Arrange, Act and Assert
    assertThrows(
        UncheckedIOException.class,
        () ->
            SafeFiles.list(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), mock(Function.class)));
  }

  /**
   * Test {@link SafeFiles#walkAll(Path, int, FileVisitOption[])} with {@code dir}, {@code
   * maxDepth}, {@code options}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link SafeFiles#walkAll(Path, int, FileVisitOption[])}
   */
  @Test
  @DisplayName(
      "Test walkAll(Path, int, FileVisitOption[]) with 'dir', 'maxDepth', 'options'; then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List SafeFiles.walkAll(Path, int, FileVisitOption[])"})
  void testWalkAllWithDirMaxDepthOptions_thenThrowUncheckedIOException() {
    // Arrange, Act and Assert
    assertThrows(
        UncheckedIOException.class,
        () ->
            SafeFiles.walkAll(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
                2,
                FileVisitOption.FOLLOW_LINKS));
  }

  /**
   * Test {@link SafeFiles#walkAll(Path, int, FileVisitOption[])} with {@code dir}, {@code
   * maxDepth}, {@code options}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link SafeFiles#walkAll(Path, int, FileVisitOption[])}
   */
  @Test
  @DisplayName(
      "Test walkAll(Path, int, FileVisitOption[]) with 'dir', 'maxDepth', 'options'; when zero; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List SafeFiles.walkAll(Path, int, FileVisitOption[])"})
  void testWalkAllWithDirMaxDepthOptions_whenZero_thenReturnSizeIsOne() {
    // Arrange
    Path dir = Paths.get(System.getProperty("java.io.tmpdir"), "");

    // Act
    List<Path> actualWalkAllResult = SafeFiles.walkAll(dir, 0, FileVisitOption.FOLLOW_LINKS);

    // Assert
    assertEquals(1, actualWalkAllResult.size());
    assertSame(dir, actualWalkAllResult.get(0));
  }

  /**
   * Test {@link SafeFiles#walkAll(Path)} with {@code dir}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link SafeFiles#walkAll(Path)}
   */
  @Test
  @DisplayName("Test walkAll(Path) with 'dir'; then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List SafeFiles.walkAll(Path)"})
  void testWalkAllWithDir_thenThrowUncheckedIOException() {
    // Arrange, Act and Assert
    assertThrows(
        UncheckedIOException.class,
        () -> SafeFiles.walkAll(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
  }

  /**
   * Test {@link SafeFiles#walk(Path, int, Function, FileVisitOption[])}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>When Property is {@code java.io.tmpdir} is empty string.
   *   <li>Then return {@code Apply}.
   * </ul>
   *
   * <p>Method under test: {@link SafeFiles#walk(Path, int, Function, FileVisitOption[])}
   */
  @Test
  @DisplayName(
      "Test walk(Path, int, Function, FileVisitOption[]); given 'Apply'; when Property is 'java.io.tmpdir' is empty string; then return 'Apply'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object SafeFiles.walk(Path, int, Function, FileVisitOption[])"})
  void testWalk_givenApply_whenPropertyIsJavaIoTmpdirIsEmptyString_thenReturnApply() {
    // Arrange
    Path dir = Paths.get(System.getProperty("java.io.tmpdir"), "");

    Function<Stream<Path>, Object> function = mock(Function.class);
    when(function.apply(Mockito.<Stream<Path>>any())).thenReturn("Apply");

    // Act
    Object actualWalkResult = SafeFiles.walk(dir, 2, function, FileVisitOption.FOLLOW_LINKS);

    // Assert
    verify(function).apply(isA(Stream.class));
    assertEquals("Apply", actualWalkResult);
  }

  /**
   * Test {@link SafeFiles#walk(Path, int, Function, FileVisitOption[])}.
   *
   * <ul>
   *   <li>Given {@link UncheckedIOException#UncheckedIOException(IOException)} with {@link
   *       IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link SafeFiles#walk(Path, int, Function, FileVisitOption[])}
   */
  @Test
  @DisplayName(
      "Test walk(Path, int, Function, FileVisitOption[]); given UncheckedIOException(IOException) with IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object SafeFiles.walk(Path, int, Function, FileVisitOption[])"})
  void testWalk_givenUncheckedIOExceptionWithIOException() {
    // Arrange
    Path dir = Paths.get(System.getProperty("java.io.tmpdir"), "");

    Function<Stream<Path>, Object> function = mock(Function.class);
    when(function.apply(Mockito.<Stream<Path>>any()))
        .thenThrow(new UncheckedIOException(new IOException()));

    // Act and Assert
    assertThrows(
        UncheckedIOException.class,
        () -> SafeFiles.walk(dir, 2, function, FileVisitOption.FOLLOW_LINKS));
    verify(function).apply(isA(Stream.class));
  }

  /**
   * Test {@link SafeFiles#walk(Path, int, Function, FileVisitOption[])}.
   *
   * <ul>
   *   <li>When Property is {@code java.io.tmpdir} is {@code test.txt}.
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link SafeFiles#walk(Path, int, Function, FileVisitOption[])}
   */
  @Test
  @DisplayName(
      "Test walk(Path, int, Function, FileVisitOption[]); when Property is 'java.io.tmpdir' is 'test.txt'; then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object SafeFiles.walk(Path, int, Function, FileVisitOption[])"})
  void testWalk_whenPropertyIsJavaIoTmpdirIsTestTxt_thenThrowUncheckedIOException() {
    // Arrange, Act and Assert
    assertThrows(
        UncheckedIOException.class,
        () ->
            SafeFiles.walk(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
                2,
                mock(Function.class),
                FileVisitOption.FOLLOW_LINKS));
  }

  /**
   * Test {@link SafeFiles#linesAll(Path)}.
   *
   * <ul>
   *   <li>When Property is {@code java.io.tmpdir} is {@code test.txt}.
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link SafeFiles#linesAll(Path)}
   */
  @Test
  @DisplayName(
      "Test linesAll(Path); when Property is 'java.io.tmpdir' is 'test.txt'; then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List SafeFiles.linesAll(Path)"})
  void testLinesAll_whenPropertyIsJavaIoTmpdirIsTestTxt_thenThrowUncheckedIOException() {
    // Arrange, Act and Assert
    assertThrows(
        UncheckedIOException.class,
        () -> SafeFiles.linesAll(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
  }

  /**
   * Test {@link SafeFiles#lines(Path, Function)}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>When Property is {@code java.io.tmpdir} is empty string.
   *   <li>Then return {@code Apply}.
   * </ul>
   *
   * <p>Method under test: {@link SafeFiles#lines(Path, Function)}
   */
  @Test
  @DisplayName(
      "Test lines(Path, Function); given 'Apply'; when Property is 'java.io.tmpdir' is empty string; then return 'Apply'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object SafeFiles.lines(Path, Function)"})
  void testLines_givenApply_whenPropertyIsJavaIoTmpdirIsEmptyString_thenReturnApply() {
    // Arrange
    Path file = Paths.get(System.getProperty("java.io.tmpdir"), "");

    Function<Stream<String>, Object> function = mock(Function.class);
    when(function.apply(Mockito.<Stream<String>>any())).thenReturn("Apply");

    // Act
    Object actualLinesResult = SafeFiles.lines(file, function);

    // Assert
    verify(function).apply(isA(Stream.class));
    assertEquals("Apply", actualLinesResult);
  }

  /**
   * Test {@link SafeFiles#lines(Path, Function)}.
   *
   * <ul>
   *   <li>Given {@link UncheckedIOException#UncheckedIOException(IOException)} with {@link
   *       IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link SafeFiles#lines(Path, Function)}
   */
  @Test
  @DisplayName(
      "Test lines(Path, Function); given UncheckedIOException(IOException) with IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object SafeFiles.lines(Path, Function)"})
  void testLines_givenUncheckedIOExceptionWithIOException() {
    // Arrange
    Path file = Paths.get(System.getProperty("java.io.tmpdir"), "");

    Function<Stream<String>, Object> function = mock(Function.class);
    when(function.apply(Mockito.<Stream<String>>any()))
        .thenThrow(new UncheckedIOException(new IOException()));

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> SafeFiles.lines(file, function));
    verify(function).apply(isA(Stream.class));
  }

  /**
   * Test {@link SafeFiles#lines(Path, Function)}.
   *
   * <ul>
   *   <li>When Property is {@code java.io.tmpdir} is {@code test.txt}.
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link SafeFiles#lines(Path, Function)}
   */
  @Test
  @DisplayName(
      "Test lines(Path, Function); when Property is 'java.io.tmpdir' is 'test.txt'; then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object SafeFiles.lines(Path, Function)"})
  void testLines_whenPropertyIsJavaIoTmpdirIsTestTxt_thenThrowUncheckedIOException() {
    // Arrange, Act and Assert
    assertThrows(
        UncheckedIOException.class,
        () ->
            SafeFiles.lines(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), mock(Function.class)));
  }
}
