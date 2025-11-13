package com.opengamma.strata.examples.marketdata;

import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.File;
import java.nio.file.Paths;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class JarMarketDataBuilderDiffblueTest {
  /**
   * Test {@link JarMarketDataBuilder#JarMarketDataBuilder(File, String)}.
   *
   * <ul>
   *   <li>When {@code Root Path}.
   * </ul>
   *
   * <p>Method under test: {@link JarMarketDataBuilder#JarMarketDataBuilder(File, String)}
   */
  @Test
  @DisplayName("Test new JarMarketDataBuilder(File, String); when 'Root Path'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void JarMarketDataBuilder.<init>(File, String)"})
  void testNewJarMarketDataBuilder_whenRootPath() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new JarMarketDataBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), "Root Path"));
  }

  /**
   * Test {@link JarMarketDataBuilder#JarMarketDataBuilder(File, String)}.
   *
   * <ul>
   *   <li>When {@code /}.
   * </ul>
   *
   * <p>Method under test: {@link JarMarketDataBuilder#JarMarketDataBuilder(File, String)}
   */
  @Test
  @DisplayName("Test new JarMarketDataBuilder(File, String); when '/'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void JarMarketDataBuilder.<init>(File, String)"})
  void testNewJarMarketDataBuilder_whenSlash() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new JarMarketDataBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), "/"));
  }
}
