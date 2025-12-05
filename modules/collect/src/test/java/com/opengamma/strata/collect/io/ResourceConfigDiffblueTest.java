package com.opengamma.strata.collect.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.io.UnicodeBom.UnicodeBomCharSource;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ResourceConfigDiffblueTest {
  /**
   * Test {@link ResourceConfig#combinedIniFile(String)} with {@code resourceName}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link ResourceConfig#combinedIniFile(String)}
   */
  @Test
  @DisplayName("Test combinedIniFile(String) with 'resourceName'; then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IniFile ResourceConfig.combinedIniFile(String)"})
  void testCombinedIniFileWithResourceName_thenThrowIllegalStateException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalStateException.class, () -> ResourceConfig.combinedIniFile("Resource Name"));
  }

  /**
   * Test {@link ResourceConfig#combinedIniFile(List)} with {@code resources}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return asMap Empty.
   * </ul>
   *
   * <p>Method under test: {@link ResourceConfig#combinedIniFile(List)}
   */
  @Test
  @DisplayName(
      "Test combinedIniFile(List) with 'resources'; when ArrayList(); then return asMap Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IniFile ResourceConfig.combinedIniFile(List)"})
  void testCombinedIniFileWithResources_whenArrayList_thenReturnAsMapEmpty() {
    // Arrange and Act
    IniFile actualCombinedIniFileResult = ResourceConfig.combinedIniFile(new ArrayList<>());

    // Assert
    assertTrue(actualCombinedIniFileResult.asMap().isEmpty());
    assertTrue(actualCombinedIniFileResult.sections().isEmpty());
  }

  /**
   * Test {@link ResourceConfig#orderedResources(String)}.
   *
   * <ul>
   *   <li>When {@code Resource Name}.
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link ResourceConfig#orderedResources(String)}
   */
  @Test
  @DisplayName(
      "Test orderedResources(String); when 'Resource Name'; then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ResourceConfig.orderedResources(String)"})
  void testOrderedResources_whenResourceName_thenThrowIllegalStateException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalStateException.class, () -> ResourceConfig.orderedResources("Resource Name"));
  }

  /**
   * Test {@link ResourceConfig#orderedResources(String)}.
   *
   * <ul>
   *   <li>When {@code /}.
   *   <li>Then return size is three.
   * </ul>
   *
   * <p>Method under test: {@link ResourceConfig#orderedResources(String)}
   */
  @Test
  @DisplayName("Test orderedResources(String); when '/'; then return size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ResourceConfig.orderedResources(String)"})
  void testOrderedResources_whenSlash_thenReturnSizeIsThree() {
    // Arrange and Act
    List<ResourceLocator> actualOrderedResourcesResult = ResourceConfig.orderedResources("/");

    // Assert
    assertEquals(3, actualOrderedResourcesResult.size());
    ResourceLocator getResult = actualOrderedResourcesResult.get(0);
    assertTrue(getResult.getCharSource() instanceof UnicodeBomCharSource);
    ResourceLocator getResult2 = actualOrderedResourcesResult.get(1);
    assertTrue(getResult2.getCharSource() instanceof UnicodeBomCharSource);
    ResourceLocator getResult3 = actualOrderedResourcesResult.get(2);
    assertTrue(getResult3.getCharSource() instanceof UnicodeBomCharSource);
    assertTrue(getResult.getByteSource() instanceof UriByteSource);
    assertTrue(getResult2.getByteSource() instanceof UriByteSource);
    assertTrue(getResult3.getByteSource() instanceof UriByteSource);
    Path getResult4 =
        Paths.get(
            System.getProperty("user.dir"),
            "modules",
            "collect",
            "target",
            "test-classes",
            "META-INF",
            "com",
            "opengamma",
            "strata",
            "config",
            "application");
    String expectedLocator =
        String.join("", "classpath:file:", getResult4.toString().concat(File.separator), "/");
    assertEquals(expectedLocator, getResult3.getLocator());
    Path getResult5 =
        Paths.get(
            System.getProperty("user.dir"),
            "modules",
            "collect",
            "target",
            "test-classes",
            "META-INF",
            "com",
            "opengamma",
            "strata",
            "config",
            "application");
    String expectedToStringResult =
        String.join("", "classpath:file:", getResult5.toString().concat(File.separator), "/");
    assertEquals(expectedToStringResult, getResult3.toString());
    Path getResult6 =
        Paths.get(
            System.getProperty("user.dir"),
            "modules",
            "collect",
            "target",
            "test-classes",
            "META-INF",
            "com",
            "opengamma",
            "strata",
            "config",
            "base");
    String expectedLocator2 =
        String.join("", "classpath:file:", getResult6.toString().concat(File.separator), "/");
    assertEquals(expectedLocator2, getResult.getLocator());
    Path getResult7 =
        Paths.get(
            System.getProperty("user.dir"),
            "modules",
            "collect",
            "target",
            "test-classes",
            "META-INF",
            "com",
            "opengamma",
            "strata",
            "config",
            "base");
    String expectedToStringResult2 =
        String.join("", "classpath:file:", getResult7.toString().concat(File.separator), "/");
    assertEquals(expectedToStringResult2, getResult.toString());
    Path getResult8 =
        Paths.get(
            System.getProperty("user.dir"),
            "modules",
            "collect",
            "target",
            "test-classes",
            "META-INF",
            "com",
            "opengamma",
            "strata",
            "config",
            "base1");
    String expectedLocator3 =
        String.join("", "classpath:file:", getResult8.toString().concat(File.separator), "/");
    assertEquals(expectedLocator3, getResult2.getLocator());
    Path getResult9 =
        Paths.get(
            System.getProperty("user.dir"),
            "modules",
            "collect",
            "target",
            "test-classes",
            "META-INF",
            "com",
            "opengamma",
            "strata",
            "config",
            "base1");
    String expectedToStringResult3 =
        String.join("", "classpath:file:", getResult9.toString().concat(File.separator), "/");
    assertEquals(expectedToStringResult3, getResult2.toString());
  }
}
