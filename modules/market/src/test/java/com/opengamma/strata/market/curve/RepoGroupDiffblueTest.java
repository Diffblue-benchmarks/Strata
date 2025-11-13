package com.opengamma.strata.market.curve;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RepoGroupDiffblueTest {
  /**
   * Test {@link RepoGroup#of(String)}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link RepoGroup#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'Name'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RepoGroup RepoGroup.of(String)"})
  void testOf_whenName_thenReturnName() {
    // Arrange and Act
    RepoGroup actualOfResult = RepoGroup.of("Name");

    // Assert
    assertEquals("Name", actualOfResult.getName());
    assertEquals("Name", actualOfResult.toString());
  }

  /**
   * Test {@link RepoGroup#RepoGroup(String)}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link RepoGroup#RepoGroup(String)}
   */
  @Test
  @DisplayName("Test new RepoGroup(String); when 'Name'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RepoGroup.<init>(String)"})
  void testNewRepoGroup_whenName_thenReturnName() {
    // Arrange and Act
    RepoGroup actualRepoGroup = new RepoGroup("Name");

    // Assert
    assertEquals("Name", actualRepoGroup.getName());
    assertEquals("Name", actualRepoGroup.toString());
  }
}
