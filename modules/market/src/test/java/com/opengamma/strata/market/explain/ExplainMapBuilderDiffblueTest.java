package com.opengamma.strata.market.explain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.List;
import java.util.function.Consumer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ExplainMapBuilderDiffblueTest {
  /**
   * Test {@link ExplainMapBuilder#build()}.
   *
   * <p>Method under test: {@link ExplainMapBuilder#build()}
   */
  @Test
  @DisplayName("Test build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ExplainMapBuilder.<init>()",
    "void ExplainMapBuilder.<init>(ExplainMapBuilder)",
    "ExplainMap ExplainMapBuilder.build()"
  })
  void testBuild() {
    // Arrange, Act and Assert
    assertTrue(ExplainMap.builder().build().isEmpty());
  }

  /**
   * Test {@link ExplainMapBuilder#openListEntry(ExplainKey)}.
   *
   * <ul>
   *   <li>Given builder.
   * </ul>
   *
   * <p>Method under test: {@link ExplainMapBuilder#openListEntry(ExplainKey)}
   */
  @Test
  @DisplayName("Test openListEntry(ExplainKey); given builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExplainMapBuilder ExplainMapBuilder.openListEntry(ExplainKey)"})
  void testOpenListEntry_givenBuilder() {
    // Arrange
    ExplainMapBuilder builderResult = ExplainMap.builder();
    ExplainKey<List<?>> key = ExplainKey.of("Name");

    // Act
    ExplainMapBuilder actualOpenListEntryResult = builderResult.openListEntry(key);

    // Assert
    ExplainMap explainMap = builderResult.build();
    assertEquals(1, explainMap.getMap().size());
    assertFalse(explainMap.isEmpty());
    ExplainMap explainMap2 = actualOpenListEntryResult.build();
    assertTrue(explainMap2.getMap().isEmpty());
    assertTrue(explainMap2.isEmpty());
  }

  /**
   * Test {@link ExplainMapBuilder#openListEntry(ExplainKey)}.
   *
   * <ul>
   *   <li>Given {@link Consumer} {@link Consumer#accept(Object)} does nothing.
   *   <li>Then calls {@link Consumer#accept(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link ExplainMapBuilder#openListEntry(ExplainKey)}
   */
  @Test
  @DisplayName(
      "Test openListEntry(ExplainKey); given Consumer accept(Object) does nothing; then calls accept(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExplainMapBuilder ExplainMapBuilder.openListEntry(ExplainKey)"})
  void testOpenListEntry_givenConsumerAcceptDoesNothing_thenCallsAccept() {
    // Arrange
    Consumer<ExplainMapBuilder> consumer = mock(Consumer.class);
    doNothing().when(consumer).accept(Mockito.<ExplainMapBuilder>any());

    ExplainMapBuilder builderResult = ExplainMap.builder();
    ExplainKey<List<?>> key = ExplainKey.of("Name");

    builderResult.addListEntry(key, consumer);
    ExplainKey<List<?>> key2 = ExplainKey.of("Name");

    // Act
    ExplainMapBuilder actualOpenListEntryResult = builderResult.openListEntry(key2);

    // Assert
    verify(consumer).accept(isA(ExplainMapBuilder.class));
    ExplainMap explainMap = builderResult.build();
    assertEquals(1, explainMap.getMap().size());
    assertFalse(explainMap.isEmpty());
    ExplainMap explainMap2 = actualOpenListEntryResult.build();
    assertTrue(explainMap2.getMap().isEmpty());
    assertTrue(explainMap2.isEmpty());
  }

  /**
   * Test {@link ExplainMapBuilder#closeListEntry(ExplainKey)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link ExplainMapBuilder#closeListEntry(ExplainKey)}
   */
  @Test
  @DisplayName("Test closeListEntry(ExplainKey); then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExplainMapBuilder ExplainMapBuilder.closeListEntry(ExplainKey)"})
  void testCloseListEntry_thenThrowIllegalStateException() {
    // Arrange
    ExplainMapBuilder explainMapBuilder = new ExplainMapBuilder(ExplainMap.builder());
    ExplainKey<List<?>> key = ExplainKey.of("Name");

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> explainMapBuilder.closeListEntry(key));
  }

  /**
   * Test {@link ExplainMapBuilder#addListEntry(ExplainKey, Consumer)}.
   *
   * <ul>
   *   <li>Given builder.
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link ExplainMapBuilder#addListEntry(ExplainKey, Consumer)}
   */
  @Test
  @DisplayName(
      "Test addListEntry(ExplainKey, Consumer); given builder; then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExplainMapBuilder ExplainMapBuilder.addListEntry(ExplainKey, Consumer)"})
  void testAddListEntry_givenBuilder_thenThrowIllegalStateException() {
    // Arrange
    ExplainMapBuilder builderResult = ExplainMap.builder();
    ExplainKey<List<?>> key = ExplainKey.of("Name");

    Consumer<ExplainMapBuilder> consumer = mock(Consumer.class);
    doThrow(new IllegalStateException()).when(consumer).accept(Mockito.<ExplainMapBuilder>any());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> builderResult.addListEntry(key, consumer));
    verify(consumer).accept(isA(ExplainMapBuilder.class));
  }

  /**
   * Test {@link ExplainMapBuilder#addListEntry(ExplainKey, Consumer)}.
   *
   * <ul>
   *   <li>Given {@link Consumer} {@link Consumer#accept(Object)} does nothing.
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link ExplainMapBuilder#addListEntry(ExplainKey, Consumer)}
   */
  @Test
  @DisplayName(
      "Test addListEntry(ExplainKey, Consumer); given Consumer accept(Object) does nothing; then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExplainMapBuilder ExplainMapBuilder.addListEntry(ExplainKey, Consumer)"})
  void testAddListEntry_givenConsumerAcceptDoesNothing_thenThrowIllegalStateException() {
    // Arrange
    Consumer<ExplainMapBuilder> consumer = mock(Consumer.class);
    doNothing().when(consumer).accept(Mockito.<ExplainMapBuilder>any());

    ExplainMapBuilder builderResult = ExplainMap.builder();
    ExplainKey<List<?>> key = ExplainKey.of("Name");

    builderResult.addListEntry(key, consumer);
    ExplainKey<List<?>> key2 = ExplainKey.of("Name");

    Consumer<ExplainMapBuilder> consumer2 = mock(Consumer.class);
    doThrow(new IllegalStateException()).when(consumer2).accept(Mockito.<ExplainMapBuilder>any());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> builderResult.addListEntry(key2, consumer2));
    verify(consumer).accept(isA(ExplainMapBuilder.class));
    verify(consumer2).accept(isA(ExplainMapBuilder.class));
  }

  /**
   * Test {@link ExplainMapBuilder#addListEntry(ExplainKey, Consumer)}.
   *
   * <ul>
   *   <li>When {@link Consumer} {@link Consumer#accept(Object)} does nothing.
   *   <li>Then builder build Map size is one.
   * </ul>
   *
   * <p>Method under test: {@link ExplainMapBuilder#addListEntry(ExplainKey, Consumer)}
   */
  @Test
  @DisplayName(
      "Test addListEntry(ExplainKey, Consumer); when Consumer accept(Object) does nothing; then builder build Map size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExplainMapBuilder ExplainMapBuilder.addListEntry(ExplainKey, Consumer)"})
  void testAddListEntry_whenConsumerAcceptDoesNothing_thenBuilderBuildMapSizeIsOne() {
    // Arrange
    ExplainMapBuilder builderResult = ExplainMap.builder();
    ExplainKey<List<?>> key = ExplainKey.of("Name");

    Consumer<ExplainMapBuilder> consumer = mock(Consumer.class);
    doNothing().when(consumer).accept(Mockito.<ExplainMapBuilder>any());

    // Act
    ExplainMapBuilder actualAddListEntryResult = builderResult.addListEntry(key, consumer);

    // Assert
    verify(consumer).accept(isA(ExplainMapBuilder.class));
    ExplainMap explainMap = builderResult.build();
    assertEquals(1, explainMap.getMap().size());
    assertFalse(explainMap.isEmpty());
    assertSame(builderResult, actualAddListEntryResult);
  }

  /**
   * Test {@link ExplainMapBuilder#addListEntryWithIndex(ExplainKey, Consumer)}.
   *
   * <ul>
   *   <li>Given builder.
   *   <li>Then builder build Map size is one.
   * </ul>
   *
   * <p>Method under test: {@link ExplainMapBuilder#addListEntryWithIndex(ExplainKey, Consumer)}
   */
  @Test
  @DisplayName(
      "Test addListEntryWithIndex(ExplainKey, Consumer); given builder; then builder build Map size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ExplainMapBuilder ExplainMapBuilder.addListEntryWithIndex(ExplainKey, Consumer)"
  })
  void testAddListEntryWithIndex_givenBuilder_thenBuilderBuildMapSizeIsOne() {
    // Arrange
    ExplainMapBuilder builderResult = ExplainMap.builder();
    ExplainKey<List<?>> key = ExplainKey.of("Name");

    Consumer<ExplainMapBuilder> consumer = mock(Consumer.class);
    doNothing().when(consumer).accept(Mockito.<ExplainMapBuilder>any());

    // Act
    ExplainMapBuilder actualAddListEntryWithIndexResult =
        builderResult.addListEntryWithIndex(key, consumer);

    // Assert
    verify(consumer).accept(isA(ExplainMapBuilder.class));
    ExplainMap explainMap = builderResult.build();
    assertEquals(1, explainMap.getMap().size());
    assertFalse(explainMap.isEmpty());
    assertSame(builderResult, actualAddListEntryWithIndexResult);
  }

  /**
   * Test {@link ExplainMapBuilder#addListEntryWithIndex(ExplainKey, Consumer)}.
   *
   * <ul>
   *   <li>Then builder build Map size is two.
   * </ul>
   *
   * <p>Method under test: {@link ExplainMapBuilder#addListEntryWithIndex(ExplainKey, Consumer)}
   */
  @Test
  @DisplayName(
      "Test addListEntryWithIndex(ExplainKey, Consumer); then builder build Map size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ExplainMapBuilder ExplainMapBuilder.addListEntryWithIndex(ExplainKey, Consumer)"
  })
  void testAddListEntryWithIndex_thenBuilderBuildMapSizeIsTwo() {
    // Arrange
    Consumer<ExplainMapBuilder> consumer = mock(Consumer.class);
    doNothing().when(consumer).accept(Mockito.<ExplainMapBuilder>any());

    Consumer<ExplainMapBuilder> consumer2 = mock(Consumer.class);
    doNothing().when(consumer2).accept(Mockito.<ExplainMapBuilder>any());

    ExplainMapBuilder builderResult = ExplainMap.builder();
    ExplainKey<List<?>> key = ExplainKey.of("Name");

    builderResult.addListEntry(key, consumer2);
    ExplainKey<List<?>> key2 = ExplainKey.of("key");

    builderResult.addListEntry(key2, consumer);
    ExplainKey<List<?>> key3 = ExplainKey.of("Name");

    Consumer<ExplainMapBuilder> consumer3 = mock(Consumer.class);
    doNothing().when(consumer3).accept(Mockito.<ExplainMapBuilder>any());

    // Act
    ExplainMapBuilder actualAddListEntryWithIndexResult =
        builderResult.addListEntryWithIndex(key3, consumer3);

    // Assert
    verify(consumer2).accept(isA(ExplainMapBuilder.class));
    verify(consumer).accept(isA(ExplainMapBuilder.class));
    verify(consumer3).accept(isA(ExplainMapBuilder.class));
    ExplainMap explainMap = builderResult.build();
    assertEquals(2, explainMap.getMap().size());
    assertFalse(explainMap.isEmpty());
    assertSame(builderResult, actualAddListEntryWithIndexResult);
  }

  /**
   * Test {@link ExplainMapBuilder#addListEntryWithIndex(ExplainKey, Consumer)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link ExplainMapBuilder#addListEntryWithIndex(ExplainKey, Consumer)}
   */
  @Test
  @DisplayName("Test addListEntryWithIndex(ExplainKey, Consumer); then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ExplainMapBuilder ExplainMapBuilder.addListEntryWithIndex(ExplainKey, Consumer)"
  })
  void testAddListEntryWithIndex_thenThrowIllegalStateException() {
    // Arrange
    ExplainMapBuilder builderResult = ExplainMap.builder();
    ExplainKey<List<?>> key = ExplainKey.of("Name");

    Consumer<ExplainMapBuilder> consumer = mock(Consumer.class);
    doThrow(new IllegalStateException()).when(consumer).accept(Mockito.<ExplainMapBuilder>any());

    // Act and Assert
    assertThrows(
        IllegalStateException.class, () -> builderResult.addListEntryWithIndex(key, consumer));
    verify(consumer).accept(isA(ExplainMapBuilder.class));
  }

  /**
   * Test {@link ExplainMapBuilder#put(ExplainKey, Object)}.
   *
   * <ul>
   *   <li>When {@link ExplainKey} with {@code Name}.
   *   <li>Then builder build Map size is one.
   * </ul>
   *
   * <p>Method under test: {@link ExplainMapBuilder#put(ExplainKey, Object)}
   */
  @Test
  @DisplayName(
      "Test put(ExplainKey, Object); when ExplainKey with 'Name'; then builder build Map size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExplainMapBuilder ExplainMapBuilder.put(ExplainKey, Object)"})
  void testPut_whenExplainKeyWithName_thenBuilderBuildMapSizeIsOne() {
    // Arrange
    ExplainMapBuilder builderResult = ExplainMap.builder();
    ExplainKey<Object> key = ExplainKey.of("Name");

    // Act
    ExplainMapBuilder actualPutResult = builderResult.put(key, "Value");

    // Assert
    ExplainMap explainMap = builderResult.build();
    assertEquals(1, explainMap.getMap().size());
    assertFalse(explainMap.isEmpty());
    assertSame(builderResult, actualPutResult);
  }
}
