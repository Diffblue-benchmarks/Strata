package com.opengamma.strata.calc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ColumnNameDiffblueTest {
  /**
   * Test {@link ColumnName#of(Measure)} with {@code measure}.
   *
   * <ul>
   *   <li>When {@link ImmutableMeasure} with {@code Name}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link ColumnName#of(Measure)}
   */
  @Test
  @DisplayName(
      "Test of(Measure) with 'measure'; when ImmutableMeasure with 'Name'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ColumnName ColumnName.of(Measure)"})
  void testOfWithMeasure_whenImmutableMeasureWithName_thenReturnName() {
    // Arrange and Act
    ColumnName actualOfResult = ColumnName.of(ImmutableMeasure.of("Name"));

    // Assert
    assertEquals("Name", actualOfResult.getName());
    assertEquals("Name", actualOfResult.toString());
  }

  /**
   * Test {@link ColumnName#of(String)} with {@code name}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link ColumnName#of(String)}
   */
  @Test
  @DisplayName("Test of(String) with 'name'; when 'Name'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ColumnName ColumnName.of(String)"})
  void testOfWithName_whenName_thenReturnName() {
    // Arrange and Act
    ColumnName actualOfResult = ColumnName.of("Name");

    // Assert
    assertEquals("Name", actualOfResult.getName());
    assertEquals("Name", actualOfResult.toString());
  }
}
