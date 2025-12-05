package com.opengamma.strata.report.framework.expression;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IterableTokenEvaluatorDiffblueTest {
  /**
   * Test {@link IterableTokenEvaluator#tokens(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is five.
   * </ul>
   *
   * <p>Method under test: {@link IterableTokenEvaluator#tokens(Iterable)}
   */
  @Test
  @DisplayName(
      "Test tokens(Iterable) with 'Iterable'; given '42'; when ArrayList() add '42'; then return size is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set IterableTokenEvaluator.tokens(Iterable)"})
  void testTokensWithIterable_given42_whenArrayListAdd42_thenReturnSizeIsFive() {
    // Arrange
    IterableTokenEvaluator iterableTokenEvaluator = new IterableTokenEvaluator();

    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");
    iterable.add("42");
    iterable.add("42");
    iterable.add("42");

    // Act
    Set<String> actualTokensResult = iterableTokenEvaluator.tokens(iterable);

    // Assert
    assertEquals(5, actualTokensResult.size());
    assertTrue(actualTokensResult.contains("2"));
    assertTrue(actualTokensResult.contains("3"));
    assertTrue(actualTokensResult.contains("4"));
  }

  /**
   * Test {@link IterableTokenEvaluator#tokens(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is four.
   * </ul>
   *
   * <p>Method under test: {@link IterableTokenEvaluator#tokens(Iterable)}
   */
  @Test
  @DisplayName(
      "Test tokens(Iterable) with 'Iterable'; given '42'; when ArrayList() add '42'; then return size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set IterableTokenEvaluator.tokens(Iterable)"})
  void testTokensWithIterable_given42_whenArrayListAdd42_thenReturnSizeIsFour() {
    // Arrange
    IterableTokenEvaluator iterableTokenEvaluator = new IterableTokenEvaluator();

    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");
    iterable.add("42");
    iterable.add("42");

    // Act
    Set<String> actualTokensResult = iterableTokenEvaluator.tokens(iterable);

    // Assert
    assertEquals(4, actualTokensResult.size());
    assertTrue(actualTokensResult.contains("1"));
    assertTrue(actualTokensResult.contains("2"));
    assertTrue(actualTokensResult.contains("3"));
  }

  /**
   * Test {@link IterableTokenEvaluator#tokens(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is six.
   * </ul>
   *
   * <p>Method under test: {@link IterableTokenEvaluator#tokens(Iterable)}
   */
  @Test
  @DisplayName(
      "Test tokens(Iterable) with 'Iterable'; given '42'; when ArrayList() add '42'; then return size is six")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set IterableTokenEvaluator.tokens(Iterable)"})
  void testTokensWithIterable_given42_whenArrayListAdd42_thenReturnSizeIsSix() {
    // Arrange
    IterableTokenEvaluator iterableTokenEvaluator = new IterableTokenEvaluator();

    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");
    iterable.add("42");
    iterable.add("42");
    iterable.add("42");
    iterable.add("42");

    // Act
    Set<String> actualTokensResult = iterableTokenEvaluator.tokens(iterable);

    // Assert
    assertEquals(6, actualTokensResult.size());
    assertTrue(actualTokensResult.contains("3"));
    assertTrue(actualTokensResult.contains("4"));
    assertTrue(actualTokensResult.contains("5"));
  }

  /**
   * Test {@link IterableTokenEvaluator#tokens(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is three.
   * </ul>
   *
   * <p>Method under test: {@link IterableTokenEvaluator#tokens(Iterable)}
   */
  @Test
  @DisplayName(
      "Test tokens(Iterable) with 'Iterable'; given '42'; when ArrayList() add '42'; then return size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set IterableTokenEvaluator.tokens(Iterable)"})
  void testTokensWithIterable_given42_whenArrayListAdd42_thenReturnSizeIsThree() {
    // Arrange
    IterableTokenEvaluator iterableTokenEvaluator = new IterableTokenEvaluator();

    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");
    iterable.add("42");

    // Act
    Set<String> actualTokensResult = iterableTokenEvaluator.tokens(iterable);

    // Assert
    assertEquals(3, actualTokensResult.size());
    assertTrue(actualTokensResult.contains("0"));
    assertTrue(actualTokensResult.contains("1"));
    assertTrue(actualTokensResult.contains("2"));
  }

  /**
   * Test {@link IterableTokenEvaluator#tokens(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link IterableTokenEvaluator#tokens(Iterable)}
   */
  @Test
  @DisplayName(
      "Test tokens(Iterable) with 'Iterable'; given '42'; when ArrayList() add '42'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set IterableTokenEvaluator.tokens(Iterable)"})
  void testTokensWithIterable_given42_whenArrayListAdd42_thenReturnSizeIsTwo() {
    // Arrange
    IterableTokenEvaluator iterableTokenEvaluator = new IterableTokenEvaluator();

    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");

    // Act
    Set<String> actualTokensResult = iterableTokenEvaluator.tokens(iterable);

    // Assert
    assertEquals(2, actualTokensResult.size());
    assertTrue(actualTokensResult.contains("0"));
    assertTrue(actualTokensResult.contains("1"));
  }

  /**
   * Test {@link IterableTokenEvaluator#tokens(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link LinkedHashSet#LinkedHashSet()} add {@code null}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link IterableTokenEvaluator#tokens(Iterable)}
   */
  @Test
  @DisplayName(
      "Test tokens(Iterable) with 'Iterable'; given 'null'; when LinkedHashSet() add 'null'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set IterableTokenEvaluator.tokens(Iterable)"})
  void testTokensWithIterable_givenNull_whenLinkedHashSetAddNull_thenReturnSizeIsOne() {
    // Arrange
    IterableTokenEvaluator iterableTokenEvaluator = new IterableTokenEvaluator();

    LinkedHashSet<?> iterable = new LinkedHashSet<>();
    iterable.add(null);

    // Act
    Set<String> actualTokensResult = iterableTokenEvaluator.tokens(iterable);

    // Assert
    assertEquals(1, actualTokensResult.size());
    assertTrue(actualTokensResult.contains("0"));
  }

  /**
   * Test {@link IterableTokenEvaluator#tokens(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link IterableTokenEvaluator#tokens(Iterable)}
   */
  @Test
  @DisplayName("Test tokens(Iterable) with 'Iterable'; when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set IterableTokenEvaluator.tokens(Iterable)"})
  void testTokensWithIterable_whenArrayList_thenReturnEmpty() {
    // Arrange
    IterableTokenEvaluator iterableTokenEvaluator = new IterableTokenEvaluator();

    // Act and Assert
    assertTrue(iterableTokenEvaluator.tokens(new ArrayList<>()).isEmpty());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link IterableTokenEvaluator}
   *   <li>{@link IterableTokenEvaluator#getTargetType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void IterableTokenEvaluator.<init>()",
    "Class IterableTokenEvaluator.getTargetType()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    Class<?> actualTargetType = new IterableTokenEvaluator().getTargetType();

    // Assert
    Class<Iterable> expectedTargetType = Iterable.class;
    assertEquals(expectedTargetType, actualTargetType);
  }
}
