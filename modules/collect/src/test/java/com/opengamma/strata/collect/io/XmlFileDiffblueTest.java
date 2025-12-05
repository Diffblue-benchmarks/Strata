package com.opengamma.strata.collect.io;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.io.ByteSource;
import java.nio.file.Paths;
import java.util.function.ToIntFunction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class XmlFileDiffblueTest {
  /**
   * Test {@link XmlFile#of(ByteSource, String)} with {@code source}, {@code refAttrName}.
   *
   * <ul>
   *   <li>When {@link ArrayByteSource#EMPTY}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link XmlFile#of(ByteSource, String)}
   */
  @Test
  @DisplayName(
      "Test of(ByteSource, String) with 'source', 'refAttrName'; when EMPTY; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"XmlFile XmlFile.of(ByteSource, String)"})
  void testOfWithSourceRefAttrName_whenEmpty_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> XmlFile.of(ArrayByteSource.EMPTY, "Ref Attr Name"));
  }

  /**
   * Test {@link XmlFile#of(ByteSource)} with {@code source}.
   *
   * <ul>
   *   <li>When {@link ArrayByteSource#EMPTY}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link XmlFile#of(ByteSource)}
   */
  @Test
  @DisplayName("Test of(ByteSource) with 'source'; when EMPTY; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"XmlFile XmlFile.of(ByteSource)"})
  void testOfWithSource_whenEmpty_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> XmlFile.of(ArrayByteSource.EMPTY));
  }

  /**
   * Test {@link XmlFile#parseElements(ByteSource, ToIntFunction)} with {@code source}, {@code
   * filterFn}.
   *
   * <p>Method under test: {@link XmlFile#parseElements(ByteSource, ToIntFunction)}
   */
  @Test
  @DisplayName("Test parseElements(ByteSource, ToIntFunction) with 'source', 'filterFn'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.collect.io.XmlElement XmlFile.parseElements(ByteSource, ToIntFunction)"
  })
  void testParseElementsWithSourceFilterFn() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            XmlFile.parseElements(
                UriByteSource.of(Paths.get(System.getProperty("java.io.tmpdir"), "").toUri()),
                mock(ToIntFunction.class)));
  }

  /**
   * Test {@link XmlFile#parseElements(ByteSource, ToIntFunction)} with {@code source}, {@code
   * filterFn}.
   *
   * <ul>
   *   <li>When {@link ArrayByteSource#EMPTY}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link XmlFile#parseElements(ByteSource, ToIntFunction)}
   */
  @Test
  @DisplayName(
      "Test parseElements(ByteSource, ToIntFunction) with 'source', 'filterFn'; when EMPTY; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.collect.io.XmlElement XmlFile.parseElements(ByteSource, ToIntFunction)"
  })
  void testParseElementsWithSourceFilterFn_whenEmpty_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> XmlFile.parseElements(ArrayByteSource.EMPTY, mock(ToIntFunction.class)));
  }
}
