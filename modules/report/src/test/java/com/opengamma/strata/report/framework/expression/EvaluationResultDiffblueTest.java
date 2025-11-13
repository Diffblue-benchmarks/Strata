package com.opengamma.strata.report.framework.expression;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.result.Failure;
import com.opengamma.strata.collect.result.Result;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EvaluationResultDiffblueTest {
  /**
   * Test {@link EvaluationResult#success(Object, List)}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code foo}.
   *   <li>Then return not Complete.
   * </ul>
   *
   * <p>Method under test: {@link EvaluationResult#success(Object, List)}
   */
  @Test
  @DisplayName(
      "Test success(Object, List); given 'foo'; when ArrayList() add 'foo'; then return not Complete")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EvaluationResult EvaluationResult.success(Object, List)"})
  void testSuccess_givenFoo_whenArrayListAddFoo_thenReturnNotComplete() {
    // Arrange
    ArrayList<String> remainingTokens = new ArrayList<>();
    remainingTokens.add("foo");
    remainingTokens.add("value");

    // Act
    EvaluationResult actualSuccessResult = EvaluationResult.success("Value", remainingTokens);

    // Assert
    Result<?> result = actualSuccessResult.getResult();
    assertEquals("Value", result.getValue());
    Optional<?> getResult = result.get();
    assertEquals("Value", getResult.get());
    assertFalse(result.isFailure());
    assertFalse(actualSuccessResult.isComplete());
    assertTrue(result.isSuccess());
    assertTrue(getResult.isPresent());
    assertSame(remainingTokens, actualSuccessResult.getRemainingTokens());
  }

  /**
   * Test {@link EvaluationResult#success(Object, List)}.
   *
   * <ul>
   *   <li>Given {@code value}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code value}.
   *   <li>Then return not Complete.
   * </ul>
   *
   * <p>Method under test: {@link EvaluationResult#success(Object, List)}
   */
  @Test
  @DisplayName(
      "Test success(Object, List); given 'value'; when ArrayList() add 'value'; then return not Complete")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EvaluationResult EvaluationResult.success(Object, List)"})
  void testSuccess_givenValue_whenArrayListAddValue_thenReturnNotComplete() {
    // Arrange
    ArrayList<String> remainingTokens = new ArrayList<>();
    remainingTokens.add("value");

    // Act
    EvaluationResult actualSuccessResult = EvaluationResult.success("Value", remainingTokens);

    // Assert
    Result<?> result = actualSuccessResult.getResult();
    assertEquals("Value", result.getValue());
    Optional<?> getResult = result.get();
    assertEquals("Value", getResult.get());
    assertFalse(result.isFailure());
    assertFalse(actualSuccessResult.isComplete());
    assertTrue(result.isSuccess());
    assertTrue(getResult.isPresent());
    assertSame(remainingTokens, actualSuccessResult.getRemainingTokens());
  }

  /**
   * Test {@link EvaluationResult#success(Object, List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Complete.
   * </ul>
   *
   * <p>Method under test: {@link EvaluationResult#success(Object, List)}
   */
  @Test
  @DisplayName("Test success(Object, List); when ArrayList(); then return Complete")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EvaluationResult EvaluationResult.success(Object, List)"})
  void testSuccess_whenArrayList_thenReturnComplete() {
    // Arrange and Act
    EvaluationResult actualSuccessResult = EvaluationResult.success("Value", new ArrayList<>());

    // Assert
    Result<?> result = actualSuccessResult.getResult();
    assertEquals("Value", result.getValue());
    Optional<?> getResult = result.get();
    assertEquals("Value", getResult.get());
    assertFalse(result.isFailure());
    assertTrue(result.isSuccess());
    assertTrue(actualSuccessResult.isComplete());
    assertTrue(actualSuccessResult.getRemainingTokens().isEmpty());
    assertTrue(getResult.isPresent());
  }

  /**
   * Test {@link EvaluationResult#of(Result, List)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return RemainingTokens is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link EvaluationResult#of(Result, List)}
   */
  @Test
  @DisplayName(
      "Test of(Result, List); given '42'; when ArrayList() add '42'; then return RemainingTokens is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EvaluationResult EvaluationResult.of(Result, List)"})
  void testOf_given42_whenArrayListAdd42_thenReturnRemainingTokensIsArrayList() {
    // Arrange
    ArrayList<String> remainingTokens = new ArrayList<>();
    remainingTokens.add("42");
    remainingTokens.add("foo");

    // Act
    EvaluationResult actualOfResult = EvaluationResult.of(null, remainingTokens);

    // Assert
    assertNull(actualOfResult.getResult());
    assertSame(remainingTokens, actualOfResult.getRemainingTokens());
  }

  /**
   * Test {@link EvaluationResult#of(Result, List)}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code foo}.
   *   <li>Then return RemainingTokens is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link EvaluationResult#of(Result, List)}
   */
  @Test
  @DisplayName(
      "Test of(Result, List); given 'foo'; when ArrayList() add 'foo'; then return RemainingTokens is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EvaluationResult EvaluationResult.of(Result, List)"})
  void testOf_givenFoo_whenArrayListAddFoo_thenReturnRemainingTokensIsArrayList() {
    // Arrange
    ArrayList<String> remainingTokens = new ArrayList<>();
    remainingTokens.add("foo");

    // Act
    EvaluationResult actualOfResult = EvaluationResult.of(null, remainingTokens);

    // Assert
    assertNull(actualOfResult.getResult());
    assertSame(remainingTokens, actualOfResult.getRemainingTokens());
  }

  /**
   * Test {@link EvaluationResult#of(Result, List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return RemainingTokens Empty.
   * </ul>
   *
   * <p>Method under test: {@link EvaluationResult#of(Result, List)}
   */
  @Test
  @DisplayName("Test of(Result, List); when ArrayList(); then return RemainingTokens Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EvaluationResult EvaluationResult.of(Result, List)"})
  void testOf_whenArrayList_thenReturnRemainingTokensEmpty() {
    // Arrange and Act
    EvaluationResult actualOfResult = EvaluationResult.of(null, new ArrayList<>());

    // Assert
    assertNull(actualOfResult.getResult());
    assertTrue(actualOfResult.getRemainingTokens().isEmpty());
  }

  /**
   * Test {@link EvaluationResult#isComplete()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code foo}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link EvaluationResult#isComplete()}
   */
  @Test
  @DisplayName("Test isComplete(); given ArrayList() add 'foo'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean EvaluationResult.isComplete()"})
  void testIsComplete_givenArrayListAddFoo_thenReturnFalse() {
    // Arrange
    ArrayList<String> remainingTokens = new ArrayList<>();
    remainingTokens.add("foo");
    Result<?> result = Result.failure((Failure) null);

    // Act and Assert
    assertFalse(EvaluationResult.of(result, remainingTokens).isComplete());
  }

  /**
   * Test {@link EvaluationResult#isComplete()}.
   *
   * <ul>
   *   <li>Given {@code Message Values}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link EvaluationResult#isComplete()}
   */
  @Test
  @DisplayName("Test isComplete(); given 'Message Values'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean EvaluationResult.isComplete()"})
  void testIsComplete_givenMessageValues_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(
        EvaluationResult.failure("Not all who wander are lost", "Message Values").isComplete());
  }

  /**
   * Test {@link EvaluationResult#isComplete()}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link EvaluationResult#isComplete()}
   */
  @Test
  @DisplayName("Test isComplete(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean EvaluationResult.isComplete()"})
  void testIsComplete_thenReturnTrue() {
    // Arrange
    Result<?> result = Result.failure((Failure) null);

    // Act and Assert
    assertTrue(EvaluationResult.of(result, new ArrayList<>()).isComplete());
  }
}
