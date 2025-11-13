package com.opengamma.strata.collect.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AsciiTableDiffblueTest {
  /**
   * Test {@link AsciiTable#generate(List, List, List)}.
   *
   * <p>Method under test: {@link AsciiTable#generate(List, List, List)}
   */
  @Test
  @DisplayName("Test generate(List, List, List)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String AsciiTable.generate(List, List, List)"})
  void testGenerate() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    ArrayList<AsciiTableAlignment> alignments = new ArrayList<>();

    ArrayList<List<String>> cells = new ArrayList<>();
    cells.add(new ArrayList<>());

    // Act
    String actualGenerateResult = AsciiTable.generate(headers, alignments, cells);

    // Assert
    assertEquals("+\n|\n+\n|\n+\n", actualGenerateResult);
  }

  /**
   * Test {@link AsciiTable#generate(List, List, List)}.
   *
   * <p>Method under test: {@link AsciiTable#generate(List, List, List)}
   */
  @Test
  @DisplayName("Test generate(List, List, List)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String AsciiTable.generate(List, List, List)"})
  void testGenerate2() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    ArrayList<AsciiTableAlignment> alignments = new ArrayList<>();

    ArrayList<List<String>> cells = new ArrayList<>();
    cells.add(new ArrayList<>());
    cells.add(new ArrayList<>());

    // Act
    String actualGenerateResult = AsciiTable.generate(headers, alignments, cells);

    // Assert
    assertEquals("+\n|\n+\n|\n|\n+\n", actualGenerateResult);
  }

  /**
   * Test {@link AsciiTable#generate(List, List, List)}.
   *
   * <ul>
   *   <li>Given {@code LEFT}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code LEFT}.
   *   <li>Then return a string.
   * </ul>
   *
   * <p>Method under test: {@link AsciiTable#generate(List, List, List)}
   */
  @Test
  @DisplayName(
      "Test generate(List, List, List); given 'LEFT'; when ArrayList() add 'LEFT'; then return a string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String AsciiTable.generate(List, List, List)"})
  void testGenerate_givenLeft_whenArrayListAddLeft_thenReturnAString() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    headers.add("Number of headers {} must match number of alignments {}");

    ArrayList<AsciiTableAlignment> alignments = new ArrayList<>();
    alignments.add(AsciiTableAlignment.LEFT);

    // Act
    String actualGenerateResult = AsciiTable.generate(headers, alignments, new ArrayList<>());

    // Assert
    assertEquals(
        "+---------------------------------------------------------+\n"
            + "| Number of headers {} must match number of alignments {} |\n"
            + "+---------------------------------------------------------+\n"
            + "+---------------------------------------------------------+\n",
        actualGenerateResult);
  }

  /**
   * Test {@link AsciiTable#generate(List, List, List)}.
   *
   * <ul>
   *   <li>Given {@code RIGHT}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code RIGHT}.
   *   <li>Then return a string.
   * </ul>
   *
   * <p>Method under test: {@link AsciiTable#generate(List, List, List)}
   */
  @Test
  @DisplayName(
      "Test generate(List, List, List); given 'RIGHT'; when ArrayList() add 'RIGHT'; then return a string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String AsciiTable.generate(List, List, List)"})
  void testGenerate_givenRight_whenArrayListAddRight_thenReturnAString() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    headers.add("Number of headers {} must match number of alignments {}");

    ArrayList<AsciiTableAlignment> alignments = new ArrayList<>();
    alignments.add(AsciiTableAlignment.RIGHT);

    // Act
    String actualGenerateResult = AsciiTable.generate(headers, alignments, new ArrayList<>());

    // Assert
    assertEquals(
        "+---------------------------------------------------------+\n"
            + "| Number of headers {} must match number of alignments {} |\n"
            + "+---------------------------------------------------------+\n"
            + "+---------------------------------------------------------+\n",
        actualGenerateResult);
  }

  /**
   * Test {@link AsciiTable#generate(List, List, List)}.
   *
   * <ul>
   *   <li>Then return {@code + | + +}.
   * </ul>
   *
   * <p>Method under test: {@link AsciiTable#generate(List, List, List)}
   */
  @Test
  @DisplayName("Test generate(List, List, List); then return '+ | + +'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String AsciiTable.generate(List, List, List)"})
  void testGenerate_thenReturnPlusSignSpaceVerticalLineSpacePlusSignSpacePlusSign() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    ArrayList<AsciiTableAlignment> alignments = new ArrayList<>();

    // Act
    String actualGenerateResult = AsciiTable.generate(headers, alignments, new ArrayList<>());

    // Assert
    assertEquals("+\n|\n+\n+\n", actualGenerateResult);
  }
}
