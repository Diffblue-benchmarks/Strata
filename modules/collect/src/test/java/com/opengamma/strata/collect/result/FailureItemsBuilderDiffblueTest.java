package com.opengamma.strata.collect.result;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FailureItemsBuilderDiffblueTest {
  /**
   * Test {@link FailureItemsBuilder#FailureItemsBuilder()}.
   *
   * <p>Method under test: default or parameterless constructor of {@link FailureItemsBuilder}
   */
  @Test
  @DisplayName("Test new FailureItemsBuilder()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FailureItemsBuilder.<init>()"})
  void testNewFailureItemsBuilder() {
    // Arrange, Act and Assert
    FailureItems failureItems = new FailureItemsBuilder().build();
    assertTrue(failureItems.isEmpty());
    assertTrue(failureItems.getFailures().isEmpty());
  }

  /**
   * Test {@link FailureItemsBuilder#addFailure(FailureItem)}.
   *
   * <ul>
   *   <li>Then builder build Failures size is one.
   * </ul>
   *
   * <p>Method under test: {@link FailureItemsBuilder#addFailure(FailureItem)}
   */
  @Test
  @DisplayName("Test addFailure(FailureItem); then builder build Failures size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FailureItemsBuilder FailureItemsBuilder.addFailure(FailureItem)"})
  void testAddFailure_thenBuilderBuildFailuresSizeIsOne() {
    // Arrange
    FailureItemsBuilder builderResult = FailureItems.builder();
    FailureItem failure =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act
    FailureItemsBuilder actualAddFailureResult = builderResult.addFailure(failure);

    // Assert
    FailureItems failureItems = builderResult.build();
    ImmutableList<FailureItem> failures = failureItems.getFailures();
    assertEquals(1, failures.size());
    assertFalse(failureItems.isEmpty());
    assertSame(failure, failures.get(0));
    assertSame(builderResult, actualAddFailureResult);
  }

  /**
   * Test {@link FailureItemsBuilder#addAllFailures(List)}.
   *
   * <ul>
   *   <li>Then return build Failures size is one.
   * </ul>
   *
   * <p>Method under test: {@link FailureItemsBuilder#addAllFailures(List)}
   */
  @Test
  @DisplayName("Test addAllFailures(List); then return build Failures size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FailureItemsBuilder FailureItemsBuilder.addAllFailures(List)"})
  void testAddAllFailures_thenReturnBuildFailuresSizeIsOne() {
    // Arrange
    FailureItemsBuilder builderResult = FailureItems.builder();

    ArrayList<FailureItem> failures = new ArrayList<>();
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    failures.add(ofResult);

    // Act and Assert
    FailureItems failureItems = builderResult.addAllFailures(failures).build();
    ImmutableList<FailureItem> failures2 = failureItems.getFailures();
    assertEquals(1, failures2.size());
    assertFalse(failureItems.isEmpty());
    FailureItems failureItems2 = builderResult.build();
    assertFalse(failureItems2.isEmpty());
    assertEquals(failures, failureItems2.getFailures());
    assertSame(ofResult, failures2.get(0));
  }

  /**
   * Test {@link FailureItemsBuilder#addAllFailures(List)}.
   *
   * <ul>
   *   <li>Then return build Failures size is two.
   * </ul>
   *
   * <p>Method under test: {@link FailureItemsBuilder#addAllFailures(List)}
   */
  @Test
  @DisplayName("Test addAllFailures(List); then return build Failures size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FailureItemsBuilder FailureItemsBuilder.addAllFailures(List)"})
  void testAddAllFailures_thenReturnBuildFailuresSizeIsTwo() {
    // Arrange
    FailureItemsBuilder builderResult = FailureItems.builder();

    ArrayList<FailureItem> failures = new ArrayList<>();
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    failures.add(ofResult);
    FailureItem ofResult2 =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    failures.add(ofResult2);

    // Act and Assert
    ImmutableList<FailureItem> failures2 =
        builderResult.addAllFailures(failures).build().getFailures();
    assertEquals(2, failures2.size());
    assertSame(ofResult2, failures2.get(1));
  }

  /**
   * Test {@link FailureItemsBuilder#addAllFailures(List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link FailureItemsBuilder#addAllFailures(List)}
   */
  @Test
  @DisplayName("Test addAllFailures(List); when ArrayList(); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FailureItemsBuilder FailureItemsBuilder.addAllFailures(List)"})
  void testAddAllFailures_whenArrayList_thenReturnBuilder() {
    // Arrange
    FailureItemsBuilder builderResult = FailureItems.builder();

    // Act
    FailureItemsBuilder actualAddAllFailuresResult =
        builderResult.addAllFailures(new ArrayList<>());

    // Assert
    assertSame(builderResult, actualAddAllFailuresResult);
  }

  /**
   * Test {@link FailureItemsBuilder#build()}.
   *
   * <p>Method under test: {@link FailureItemsBuilder#build()}
   */
  @Test
  @DisplayName("Test build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FailureItems FailureItemsBuilder.build()"})
  void testBuild() {
    // Arrange and Act
    FailureItems actualFailureItems = FailureItems.builder().build();

    // Assert
    assertSame(FailureItems.EMPTY, actualFailureItems);
  }
}
