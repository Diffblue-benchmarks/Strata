package com.opengamma.strata.examples.marketdata;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DirectoryMarketDataBuilderDiffblueTest {
  /**
   * Test {@link DirectoryMarketDataBuilder#getAllResources(String)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DirectoryMarketDataBuilder#getAllResources(String)}
   */
  @Test
  @DisplayName("Test getAllResources(String); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Collection DirectoryMarketDataBuilder.getAllResources(String)"})
  void testGetAllResources_thenThrowIllegalArgumentException() {
    // Arrange
    Path rootPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new DirectoryMarketDataBuilder(rootPath).getAllResources("/directory"));
  }

  /**
   * Test {@link DirectoryMarketDataBuilder#getResource(String, String)}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DirectoryMarketDataBuilder#getResource(String, String)}
   */
  @Test
  @DisplayName("Test getResource(String, String); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.collect.io.ResourceLocator DirectoryMarketDataBuilder.getResource(String, String)"
  })
  void testGetResource_thenReturnNull() {
    // Arrange
    Path rootPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");

    // Act and Assert
    assertNull(new DirectoryMarketDataBuilder(rootPath).getResource("/directory", "Resource Name"));
  }

  /**
   * Test {@link DirectoryMarketDataBuilder#subdirectoryExists(String)}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link DirectoryMarketDataBuilder#subdirectoryExists(String)}
   */
  @Test
  @DisplayName("Test subdirectoryExists(String); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DirectoryMarketDataBuilder.subdirectoryExists(String)"})
  void testSubdirectoryExists_thenReturnFalse() {
    // Arrange
    Path rootPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");

    // Act and Assert
    assertFalse(new DirectoryMarketDataBuilder(rootPath).subdirectoryExists("/directory"));
  }

  /**
   * Test {@link DirectoryMarketDataBuilder#subdirectoryExists(String)}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link DirectoryMarketDataBuilder#subdirectoryExists(String)}
   */
  @Test
  @DisplayName("Test subdirectoryExists(String); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DirectoryMarketDataBuilder.subdirectoryExists(String)"})
  void testSubdirectoryExists_thenReturnTrue() {
    // Arrange
    Path rootPath = Paths.get(System.getProperty("java.io.tmpdir"), "");

    // Act and Assert
    assertTrue(new DirectoryMarketDataBuilder(rootPath).subdirectoryExists(""));
  }
}
