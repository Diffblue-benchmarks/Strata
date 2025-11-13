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
}
