package com.opengamma.strata.report.framework.format;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UnsupportedValueFormatterDiffblueTest {
  /**
   * Test {@link UnsupportedValueFormatter#formatForCsv(Object)}.
   *
   * <p>Method under test: {@link UnsupportedValueFormatter#formatForCsv(Object)}
   */
  @Test
  @DisplayName("Test formatForCsv(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String UnsupportedValueFormatter.formatForCsv(Object)"})
  void testFormatForCsv() {
    // Arrange, Act and Assert
    assertEquals("<String>", UnsupportedValueFormatter.INSTANCE.formatForCsv("Object"));
  }

  /**
   * Test {@link UnsupportedValueFormatter#formatForDisplay(Object)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return {@code <HashSet> - drill down using a field: [0]}.
   * </ul>
   *
   * <p>Method under test: {@link UnsupportedValueFormatter#formatForDisplay(Object)}
   */
  @Test
  @DisplayName(
      "Test formatForDisplay(Object); given '42'; then return '<HashSet> - drill down using a field: [0]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String UnsupportedValueFormatter.formatForDisplay(Object)"})
  void testFormatForDisplay_given42_thenReturnHashSetDrillDownUsingAField0() {
    // Arrange
    HashSet<Object> objectSet = new HashSet<>();
    objectSet.add("42");

    // Act and Assert
    assertEquals(
        "<HashSet> - drill down using a field: [0]",
        UnsupportedValueFormatter.INSTANCE.formatForDisplay(objectSet));
  }

  /**
   * Test {@link UnsupportedValueFormatter#formatForDisplay(Object)}.
   *
   * <ul>
   *   <li>Given two.
   *   <li>Then return {@code <HashSet> - drill down using a field: [0, 1]}.
   * </ul>
   *
   * <p>Method under test: {@link UnsupportedValueFormatter#formatForDisplay(Object)}
   */
  @Test
  @DisplayName(
      "Test formatForDisplay(Object); given two; then return '<HashSet> - drill down using a field: [0, 1]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String UnsupportedValueFormatter.formatForDisplay(Object)"})
  void testFormatForDisplay_givenTwo_thenReturnHashSetDrillDownUsingAField01() {
    // Arrange
    HashSet<Object> objectSet = new HashSet<>();
    objectSet.add(2);
    objectSet.add("42");

    // Act and Assert
    assertEquals(
        "<HashSet> - drill down using a field: [0, 1]",
        UnsupportedValueFormatter.INSTANCE.formatForDisplay(objectSet));
  }

  /**
   * Test {@link UnsupportedValueFormatter#formatForDisplay(Object)}.
   *
   * <ul>
   *   <li>Then return {@code <HashSet> - drilling into this type is not supported}.
   * </ul>
   *
   * <p>Method under test: {@link UnsupportedValueFormatter#formatForDisplay(Object)}
   */
  @Test
  @DisplayName(
      "Test formatForDisplay(Object); then return '<HashSet> - drilling into this type is not supported'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String UnsupportedValueFormatter.formatForDisplay(Object)"})
  void testFormatForDisplay_thenReturnHashSetDrillingIntoThisTypeIsNotSupported() {
    // Arrange, Act and Assert
    assertEquals(
        "<HashSet> - drilling into this type is not supported",
        UnsupportedValueFormatter.INSTANCE.formatForDisplay(new HashSet<>()));
  }

  /**
   * Test {@link UnsupportedValueFormatter#formatForDisplay(Object)}.
   *
   * <ul>
   *   <li>Then return {@code <String> - drilling into this type is not supported}.
   * </ul>
   *
   * <p>Method under test: {@link UnsupportedValueFormatter#formatForDisplay(Object)}
   */
  @Test
  @DisplayName(
      "Test formatForDisplay(Object); then return '<String> - drilling into this type is not supported'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String UnsupportedValueFormatter.formatForDisplay(Object)"})
  void testFormatForDisplay_thenReturnStringDrillingIntoThisTypeIsNotSupported() {
    // Arrange, Act and Assert
    assertEquals(
        "<String> - drilling into this type is not supported",
        UnsupportedValueFormatter.INSTANCE.formatForDisplay("Object"));
  }
}
