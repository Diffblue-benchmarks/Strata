package com.opengamma.strata.collect.io;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.CharArrayWriter;
import java.io.PipedWriter;
import java.io.UncheckedIOException;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IniFileOutputDiffblueTest {
  /**
   * Test {@link IniFileOutput#writeSection(String, PropertySet)}.
   *
   * <ul>
   *   <li>Given standard {@link CharArrayWriter#CharArrayWriter()}.
   *   <li>When {@code Section Name}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link IniFileOutput#writeSection(String, PropertySet)}
   */
  @Test
  @DisplayName(
      "Test writeSection(String, PropertySet); given standard CharArrayWriter(); when 'Section Name'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IniFileOutput.writeSection(String, PropertySet)"})
  void testWriteSection_givenStandardCharArrayWriter_whenSectionName_thenDoesNotThrow() {
    // Arrange
    IniFileOutput standardResult = IniFileOutput.standard(new CharArrayWriter());

    // Act and Assert
    assertDoesNotThrow(() -> standardResult.writeSection("Section Name", PropertySet.empty()));
  }

  /**
   * Test {@link IniFileOutput#writeSection(String, PropertySet)}.
   *
   * <ul>
   *   <li>Given standard {@link PipedWriter#PipedWriter()}.
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link IniFileOutput#writeSection(String, PropertySet)}
   */
  @Test
  @DisplayName(
      "Test writeSection(String, PropertySet); given standard PipedWriter(); then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IniFileOutput.writeSection(String, PropertySet)"})
  void testWriteSection_givenStandardPipedWriter_thenThrowUncheckedIOException() {
    // Arrange
    IniFileOutput standardResult = IniFileOutput.standard(new PipedWriter());

    // Act and Assert
    assertThrows(
        UncheckedIOException.class,
        () -> standardResult.writeSection("Section Name", PropertySet.empty()));
  }

  /**
   * Test {@link IniFileOutput#writeSection(String, PropertySet)}.
   *
   * <ul>
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link IniFileOutput#writeSection(String, PropertySet)}
   */
  @Test
  @DisplayName("Test writeSection(String, PropertySet); then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IniFileOutput.writeSection(String, PropertySet)"})
  void testWriteSection_thenDoesNotThrow() {
    // Arrange
    IniFileOutput standardResult = IniFileOutput.standard(new CharArrayWriter(), false, "New Line");

    // Act and Assert
    assertDoesNotThrow(() -> standardResult.writeSection("Section Name", PropertySet.empty()));
  }

  /**
   * Test {@link IniFileOutput#writeIniFile(IniFile)}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is empty.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link IniFileOutput#writeIniFile(IniFile)}
   */
  @Test
  @DisplayName(
      "Test writeIniFile(IniFile); given 'Key'; when HashMap() 'Key' is empty; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IniFileOutput.writeIniFile(IniFile)"})
  void testWriteIniFile_givenKey_whenHashMapKeyIsEmpty_thenDoesNotThrow() {
    // Arrange
    IniFileOutput standardResult = IniFileOutput.standard(new CharArrayWriter());

    HashMap<String, PropertySet> sectionMap = new HashMap<>();
    sectionMap.put("Key", PropertySet.empty());

    // Act and Assert
    assertDoesNotThrow(() -> standardResult.writeIniFile(IniFile.of(sectionMap)));
  }

  /**
   * Test {@link IniFileOutput#writeIniFile(IniFile)}.
   *
   * <ul>
   *   <li>Given {@code section}.
   *   <li>When {@link HashMap#HashMap()} {@code section} is empty.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link IniFileOutput#writeIniFile(IniFile)}
   */
  @Test
  @DisplayName(
      "Test writeIniFile(IniFile); given 'section'; when HashMap() 'section' is empty; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IniFileOutput.writeIniFile(IniFile)"})
  void testWriteIniFile_givenSection_whenHashMapSectionIsEmpty_thenDoesNotThrow() {
    // Arrange
    IniFileOutput standardResult = IniFileOutput.standard(new CharArrayWriter());

    HashMap<String, PropertySet> sectionMap = new HashMap<>();
    sectionMap.put("section", PropertySet.empty());
    sectionMap.put("Key", PropertySet.empty());

    // Act and Assert
    assertDoesNotThrow(() -> standardResult.writeIniFile(IniFile.of(sectionMap)));
  }

  /**
   * Test {@link IniFileOutput#writeIniFile(IniFile)}.
   *
   * <ul>
   *   <li>Given standard {@link PipedWriter#PipedWriter()}.
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link IniFileOutput#writeIniFile(IniFile)}
   */
  @Test
  @DisplayName(
      "Test writeIniFile(IniFile); given standard PipedWriter(); then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IniFileOutput.writeIniFile(IniFile)"})
  void testWriteIniFile_givenStandardPipedWriter_thenThrowUncheckedIOException() {
    // Arrange
    IniFileOutput standardResult = IniFileOutput.standard(new PipedWriter());

    HashMap<String, PropertySet> sectionMap = new HashMap<>();
    sectionMap.put("Key", PropertySet.empty());

    // Act and Assert
    assertThrows(
        UncheckedIOException.class, () -> standardResult.writeIniFile(IniFile.of(sectionMap)));
  }

  /**
   * Test {@link IniFileOutput#writeIniFile(IniFile)}.
   *
   * <ul>
   *   <li>When {@link IniFile} with source is {@link StringCharSource#EMPTY}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link IniFileOutput#writeIniFile(IniFile)}
   */
  @Test
  @DisplayName("Test writeIniFile(IniFile); when IniFile with source is EMPTY; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IniFileOutput.writeIniFile(IniFile)"})
  void testWriteIniFile_whenIniFileWithSourceIsEmpty_thenDoesNotThrow() {
    // Arrange
    IniFileOutput standardResult = IniFileOutput.standard(new CharArrayWriter());

    // Act and Assert
    assertDoesNotThrow(() -> standardResult.writeIniFile(IniFile.of(StringCharSource.EMPTY)));
  }
}
