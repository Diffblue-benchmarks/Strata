package com.opengamma.strata.examples.marketdata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.data.ImmutableMarketData;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import javax.management.loading.MLet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ExampleMarketDataBuilderDiffblueTest {
  /**
   * Test {@link ExampleMarketDataBuilder#ofResource(String, ClassLoader)} with {@code
   * resourceRoot}, {@code classLoader}.
   *
   * <ul>
   *   <li>When {@code \}.
   * </ul>
   *
   * <p>Method under test: {@link ExampleMarketDataBuilder#ofResource(String, ClassLoader)}
   */
  @Test
  @DisplayName("Test ofResource(String, ClassLoader) with 'resourceRoot', 'classLoader'; when '\\'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ExampleMarketDataBuilder ExampleMarketDataBuilder.ofResource(String, ClassLoader)"
  })
  void testOfResourceWithResourceRootClassLoader_whenBackslash() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ExampleMarketDataBuilder.ofResource("\\", new MLet()));
  }

  /**
   * Test {@link ExampleMarketDataBuilder#ofResource(String, ClassLoader)} with {@code
   * resourceRoot}, {@code classLoader}.
   *
   * <ul>
   *   <li>When {@code Resource Root}.
   * </ul>
   *
   * <p>Method under test: {@link ExampleMarketDataBuilder#ofResource(String, ClassLoader)}
   */
  @Test
  @DisplayName(
      "Test ofResource(String, ClassLoader) with 'resourceRoot', 'classLoader'; when 'Resource Root'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ExampleMarketDataBuilder ExampleMarketDataBuilder.ofResource(String, ClassLoader)"
  })
  void testOfResourceWithResourceRootClassLoader_whenResourceRoot() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ExampleMarketDataBuilder.ofResource("Resource Root", new MLet()));
  }

  /**
   * Test {@link ExampleMarketDataBuilder#ofResource(String, ClassLoader)} with {@code
   * resourceRoot}, {@code classLoader}.
   *
   * <ul>
   *   <li>When {@code /}.
   * </ul>
   *
   * <p>Method under test: {@link ExampleMarketDataBuilder#ofResource(String, ClassLoader)}
   */
  @Test
  @DisplayName("Test ofResource(String, ClassLoader) with 'resourceRoot', 'classLoader'; when '/'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ExampleMarketDataBuilder ExampleMarketDataBuilder.ofResource(String, ClassLoader)"
  })
  void testOfResourceWithResourceRootClassLoader_whenSlash() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ExampleMarketDataBuilder.ofResource("/", new MLet()));
  }

  /**
   * Test {@link ExampleMarketDataBuilder#ofResource(String)} with {@code resourceRoot}.
   *
   * <ul>
   *   <li>Then return {@link DirectoryMarketDataBuilder}.
   * </ul>
   *
   * <p>Method under test: {@link ExampleMarketDataBuilder#ofResource(String)}
   */
  @Test
  @DisplayName(
      "Test ofResource(String) with 'resourceRoot'; then return DirectoryMarketDataBuilder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExampleMarketDataBuilder ExampleMarketDataBuilder.ofResource(String)"})
  void testOfResourceWithResourceRoot_thenReturnDirectoryMarketDataBuilder() {
    // Arrange, Act and Assert
    assertTrue(ExampleMarketDataBuilder.ofResource("///") instanceof DirectoryMarketDataBuilder);
  }

  /**
   * Test {@link ExampleMarketDataBuilder#ofResource(String)} with {@code resourceRoot}.
   *
   * <ul>
   *   <li>When {@code \}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ExampleMarketDataBuilder#ofResource(String)}
   */
  @Test
  @DisplayName(
      "Test ofResource(String) with 'resourceRoot'; when '\\'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExampleMarketDataBuilder ExampleMarketDataBuilder.ofResource(String)"})
  void testOfResourceWithResourceRoot_whenBackslash_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ExampleMarketDataBuilder.ofResource("\\"));
  }

  /**
   * Test {@link ExampleMarketDataBuilder#ofResource(String)} with {@code resourceRoot}.
   *
   * <ul>
   *   <li>When {@code Resource Root}.
   * </ul>
   *
   * <p>Method under test: {@link ExampleMarketDataBuilder#ofResource(String)}
   */
  @Test
  @DisplayName("Test ofResource(String) with 'resourceRoot'; when 'Resource Root'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExampleMarketDataBuilder ExampleMarketDataBuilder.ofResource(String)"})
  void testOfResourceWithResourceRoot_whenResourceRoot() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ExampleMarketDataBuilder.ofResource("Resource Root"));
  }

  /**
   * Test {@link ExampleMarketDataBuilder#ofResource(String)} with {@code resourceRoot}.
   *
   * <ul>
   *   <li>When {@code //}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ExampleMarketDataBuilder#ofResource(String)}
   */
  @Test
  @DisplayName(
      "Test ofResource(String) with 'resourceRoot'; when '//'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExampleMarketDataBuilder ExampleMarketDataBuilder.ofResource(String)"})
  void testOfResourceWithResourceRoot_whenSlashSlash_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ExampleMarketDataBuilder.ofResource("//"));
  }

  /**
   * Test {@link ExampleMarketDataBuilder#ofResource(String)} with {@code resourceRoot}.
   *
   * <ul>
   *   <li>When {@code /}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ExampleMarketDataBuilder#ofResource(String)}
   */
  @Test
  @DisplayName(
      "Test ofResource(String) with 'resourceRoot'; when '/'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExampleMarketDataBuilder ExampleMarketDataBuilder.ofResource(String)"})
  void testOfResourceWithResourceRoot_whenSlash_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ExampleMarketDataBuilder.ofResource("/"));
  }

  /**
   * Test {@link ExampleMarketDataBuilder#ofPath(Path)}.
   *
   * <p>Method under test: {@link ExampleMarketDataBuilder#ofPath(Path)}
   */
  @Test
  @DisplayName("Test ofPath(Path)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExampleMarketDataBuilder ExampleMarketDataBuilder.ofPath(Path)"})
  void testOfPath() {
    // Arrange, Act and Assert
    assertTrue(
        ExampleMarketDataBuilder.ofPath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))
            instanceof DirectoryMarketDataBuilder);
  }

  /**
   * Test {@link ExampleMarketDataBuilder#buildSnapshot(LocalDate)}.
   *
   * <p>Method under test: {@link ExampleMarketDataBuilder#buildSnapshot(LocalDate)}
   */
  @Test
  @DisplayName("Test buildSnapshot(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketData ExampleMarketDataBuilder.buildSnapshot(LocalDate)"})
  void testBuildSnapshot() {
    // Arrange
    Path rootPath = Paths.get(System.getProperty("java.io.tmpdir"), "valuationDate");
    LocalDate marketDataDate = LocalDate.of(1970, 1, 1);

    // Act
    ImmutableMarketData actualBuildSnapshotResult =
        new DirectoryMarketDataBuilder(rootPath).buildSnapshot(marketDataDate);

    // Assert
    assertEquals(1, actualBuildSnapshotResult.getValues().size());
    assertEquals(1, actualBuildSnapshotResult.getIds().size());
    assertTrue(actualBuildSnapshotResult.getTimeSeries().isEmpty());
    assertTrue(actualBuildSnapshotResult.getTimeSeriesIds().isEmpty());
    assertSame(marketDataDate, actualBuildSnapshotResult.getValuationDate());
  }

  /**
   * Test {@link ExampleMarketDataBuilder#buildSnapshot(LocalDate)}.
   *
   * <ul>
   *   <li>Then return Values size is one.
   * </ul>
   *
   * <p>Method under test: {@link ExampleMarketDataBuilder#buildSnapshot(LocalDate)}
   */
  @Test
  @DisplayName("Test buildSnapshot(LocalDate); then return Values size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketData ExampleMarketDataBuilder.buildSnapshot(LocalDate)"})
  void testBuildSnapshot_thenReturnValuesSizeIsOne() {
    // Arrange
    Path rootPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    LocalDate marketDataDate = LocalDate.of(1970, 1, 1);

    // Act
    ImmutableMarketData actualBuildSnapshotResult =
        new DirectoryMarketDataBuilder(rootPath).buildSnapshot(marketDataDate);

    // Assert
    assertEquals(1, actualBuildSnapshotResult.getValues().size());
    assertEquals(1, actualBuildSnapshotResult.getIds().size());
    assertTrue(actualBuildSnapshotResult.getTimeSeries().isEmpty());
    assertTrue(actualBuildSnapshotResult.getTimeSeriesIds().isEmpty());
    assertSame(marketDataDate, actualBuildSnapshotResult.getValuationDate());
  }

  /**
   * Test {@link ExampleMarketDataBuilder#ratesLookup(LocalDate)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ExampleMarketDataBuilder#ratesLookup(LocalDate)}
   */
  @Test
  @DisplayName("Test ratesLookup(LocalDate); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.measure.rate.RatesMarketDataLookup ExampleMarketDataBuilder.ratesLookup(LocalDate)"
  })
  void testRatesLookup_thenThrowIllegalArgumentException() {
    // Arrange
    Path rootPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new DirectoryMarketDataBuilder(rootPath).ratesLookup(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link ExampleMarketDataBuilder#loadAllRatesCurves()}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ExampleMarketDataBuilder#loadAllRatesCurves()}
   */
  @Test
  @DisplayName("Test loadAllRatesCurves(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.SortedMap ExampleMarketDataBuilder.loadAllRatesCurves()"})
  void testLoadAllRatesCurves_thenThrowIllegalArgumentException() {
    // Arrange
    Path rootPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new DirectoryMarketDataBuilder(rootPath).loadAllRatesCurves());
  }
}
