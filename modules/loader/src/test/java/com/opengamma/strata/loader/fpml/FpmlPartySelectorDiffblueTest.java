package com.opengamma.strata.loader.fpml;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableListMultimap.Builder;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class FpmlPartySelectorDiffblueTest {
  /**
   * Test {@link FpmlPartySelector#any()}.
   *
   * <p>Method under test: {@link FpmlPartySelector#any()}
   */
  @Test
  @DisplayName("Test any()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FpmlPartySelector FpmlPartySelector.any()"})
  void testAny() {
    // Arrange and Act
    FpmlPartySelector actualAnyResult = FpmlPartySelector.any();
    Builder<String, String> builderResult = ImmutableListMultimap.builder();

    // Assert
    assertTrue(
        actualAnyResult
            .selectParties(
                builderResult
                    .expectedValuesPerKey(42)
                    .orderKeysBy(mock(Comparator.class))
                    .orderValuesBy(mock(Comparator.class))
                    .build())
            .isEmpty());
  }

  /**
   * Test {@link FpmlPartySelector#matching(String)}.
   *
   * <p>Method under test: {@link FpmlPartySelector#matching(String)}
   */
  @Test
  @DisplayName("Test matching(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FpmlPartySelector FpmlPartySelector.matching(String)"})
  void testMatching() {
    // Arrange and Act
    FpmlPartySelector actualMatchingResult = FpmlPartySelector.matching("42");
    Builder<String, String> builderResult = ImmutableListMultimap.builder();

    // Assert
    assertTrue(
        actualMatchingResult
            .selectParties(
                builderResult
                    .expectedValuesPerKey(42)
                    .orderKeysBy(mock(Comparator.class))
                    .orderValuesBy(mock(Comparator.class))
                    .build())
            .isEmpty());
  }

  /**
   * Test {@link FpmlPartySelector#matching(String)}.
   *
   * <p>Method under test: {@link FpmlPartySelector#matching(String)}
   */
  @Test
  @DisplayName("Test matching(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FpmlPartySelector FpmlPartySelector.matching(String)"})
  void testMatching2() {
    // Arrange and Act
    FpmlPartySelector actualMatchingResult = FpmlPartySelector.matching("42");
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "42");
    List<String> actualSelectPartiesResult =
        actualMatchingResult.selectParties(
            builderResult
                .expectedValuesPerKey(42)
                .orderKeysBy(mock(Comparator.class))
                .orderValuesBy(mock(Comparator.class))
                .build());

    // Assert
    assertEquals(1, actualSelectPartiesResult.size());
    assertEquals("Key", actualSelectPartiesResult.get(0));
  }

  /**
   * Test {@link FpmlPartySelector#matching(String)}.
   *
   * <p>Method under test: {@link FpmlPartySelector#matching(String)}
   */
  @Test
  @DisplayName("Test matching(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FpmlPartySelector FpmlPartySelector.matching(String)"})
  void testMatching3() {
    // Arrange and Act
    FpmlPartySelector actualMatchingResult = FpmlPartySelector.matching("42");
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    builderResult.put("Key", "42");
    Builder<String, String> orderKeysByResult =
        builderResult.expectedValuesPerKey(42).orderKeysBy(mock(Comparator.class));
    Comparator<String> valueComparator = mock(Comparator.class);
    when(valueComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    List<String> actualSelectPartiesResult =
        actualMatchingResult.selectParties(
            orderKeysByResult.orderValuesBy(valueComparator).build());

    // Assert
    verify(valueComparator).compare("42", "Value");
    assertEquals(1, actualSelectPartiesResult.size());
    assertEquals("Key", actualSelectPartiesResult.get(0));
  }

  /**
   * Test {@link FpmlPartySelector#matching(String)}.
   *
   * <p>Method under test: {@link FpmlPartySelector#matching(String)}
   */
  @Test
  @DisplayName("Test matching(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FpmlPartySelector FpmlPartySelector.matching(String)"})
  void testMatching4() {
    // Arrange and Act
    FpmlPartySelector actualMatchingResult = FpmlPartySelector.matching("42");
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put(new SimpleEntry<>("Value", "42"));
    builderResult.put("Key", "Value");
    builderResult.put("Key", "42");
    Builder<String, String> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);
    Comparator<String> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    Builder<String, String> orderKeysByResult =
        expectedValuesPerKeyResult.orderKeysBy(keyComparator);
    Comparator<String> valueComparator = mock(Comparator.class);
    when(valueComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    List<String> actualSelectPartiesResult =
        actualMatchingResult.selectParties(
            orderKeysByResult.orderValuesBy(valueComparator).build());

    // Assert
    verify(valueComparator).compare("42", "Value");
    verify(keyComparator).compare("Key", "Value");
    assertEquals(2, actualSelectPartiesResult.size());
    assertEquals("Key", actualSelectPartiesResult.get(1));
    assertEquals("Value", actualSelectPartiesResult.get(0));
  }

  /**
   * Test {@link FpmlPartySelector#matchingRegex(Pattern)}.
   *
   * <p>Method under test: {@link FpmlPartySelector#matchingRegex(Pattern)}
   */
  @Test
  @DisplayName("Test matchingRegex(Pattern)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FpmlPartySelector FpmlPartySelector.matchingRegex(Pattern)"})
  void testMatchingRegex() {
    // Arrange and Act
    FpmlPartySelector actualMatchingRegexResult =
        FpmlPartySelector.matchingRegex(Pattern.compile(".*\\.txt"));
    Builder<String, String> builderResult = ImmutableListMultimap.builder();

    // Assert
    assertTrue(
        actualMatchingRegexResult
            .selectParties(
                builderResult
                    .expectedValuesPerKey(42)
                    .orderKeysBy(mock(Comparator.class))
                    .orderValuesBy(mock(Comparator.class))
                    .build())
            .isEmpty());
  }

  /**
   * Test {@link FpmlPartySelector#matchingRegex(Pattern)}.
   *
   * <p>Method under test: {@link FpmlPartySelector#matchingRegex(Pattern)}
   */
  @Test
  @DisplayName("Test matchingRegex(Pattern)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FpmlPartySelector FpmlPartySelector.matchingRegex(Pattern)"})
  void testMatchingRegex2() {
    // Arrange and Act
    FpmlPartySelector actualMatchingRegexResult =
        FpmlPartySelector.matchingRegex(Pattern.compile(".*\\.txt"));
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "42");

    // Assert
    assertTrue(
        actualMatchingRegexResult
            .selectParties(
                builderResult
                    .expectedValuesPerKey(42)
                    .orderKeysBy(mock(Comparator.class))
                    .orderValuesBy(mock(Comparator.class))
                    .build())
            .isEmpty());
  }

  /**
   * Test {@link FpmlPartySelector#matchingRegex(Pattern)}.
   *
   * <p>Method under test: {@link FpmlPartySelector#matchingRegex(Pattern)}
   */
  @Test
  @DisplayName("Test matchingRegex(Pattern)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FpmlPartySelector FpmlPartySelector.matchingRegex(Pattern)"})
  void testMatchingRegex3() {
    // Arrange and Act
    FpmlPartySelector actualMatchingRegexResult =
        FpmlPartySelector.matchingRegex(Pattern.compile(".*\\.txt"));
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "U.txt");
    builderResult.put("Key", "42");
    Builder<String, String> orderKeysByResult =
        builderResult.expectedValuesPerKey(42).orderKeysBy(mock(Comparator.class));
    Comparator<String> valueComparator = mock(Comparator.class);
    when(valueComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    List<String> actualSelectPartiesResult =
        actualMatchingRegexResult.selectParties(
            orderKeysByResult.orderValuesBy(valueComparator).build());

    // Assert
    verify(valueComparator).compare("42", "U.txt");
    assertEquals(1, actualSelectPartiesResult.size());
    assertEquals("Key", actualSelectPartiesResult.get(0));
  }

  /**
   * Test {@link FpmlPartySelector#matchingRegex(Pattern)}.
   *
   * <p>Method under test: {@link FpmlPartySelector#matchingRegex(Pattern)}
   */
  @Test
  @DisplayName("Test matchingRegex(Pattern)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FpmlPartySelector FpmlPartySelector.matchingRegex(Pattern)"})
  void testMatchingRegex4() {
    // Arrange and Act
    FpmlPartySelector actualMatchingRegexResult =
        FpmlPartySelector.matchingRegex(Pattern.compile(".*\\.txt"));
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put("42", "Value");
    builderResult.put("Key", "U.txt");
    builderResult.put("Key", "42");
    Builder<String, String> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);
    Comparator<String> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    Builder<String, String> orderKeysByResult =
        expectedValuesPerKeyResult.orderKeysBy(keyComparator);
    Comparator<String> valueComparator = mock(Comparator.class);
    when(valueComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    List<String> actualSelectPartiesResult =
        actualMatchingRegexResult.selectParties(
            orderKeysByResult.orderValuesBy(valueComparator).build());

    // Assert
    verify(valueComparator).compare("42", "U.txt");
    verify(keyComparator).compare("Key", "42");
    assertEquals(1, actualSelectPartiesResult.size());
    assertEquals("Key", actualSelectPartiesResult.get(0));
  }

  /**
   * Test {@link FpmlPartySelector#matchingRegex(Pattern)}.
   *
   * <p>Method under test: {@link FpmlPartySelector#matchingRegex(Pattern)}
   */
  @Test
  @DisplayName("Test matchingRegex(Pattern)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FpmlPartySelector FpmlPartySelector.matchingRegex(Pattern)"})
  void testMatchingRegex5() {
    // Arrange and Act
    FpmlPartySelector actualMatchingRegexResult =
        FpmlPartySelector.matchingRegex(Pattern.compile(".*\\.txt"));
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put("42", "U.txt");
    builderResult.put("Key", "U.txt");
    builderResult.put("Key", "42");
    Builder<String, String> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);
    Comparator<String> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    Builder<String, String> orderKeysByResult =
        expectedValuesPerKeyResult.orderKeysBy(keyComparator);
    Comparator<String> valueComparator = mock(Comparator.class);
    when(valueComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    List<String> actualSelectPartiesResult =
        actualMatchingRegexResult.selectParties(
            orderKeysByResult.orderValuesBy(valueComparator).build());

    // Assert
    verify(valueComparator).compare("42", "U.txt");
    verify(keyComparator).compare("Key", "42");
    assertEquals(2, actualSelectPartiesResult.size());
    assertEquals("42", actualSelectPartiesResult.get(0));
    assertEquals("Key", actualSelectPartiesResult.get(1));
  }
}
